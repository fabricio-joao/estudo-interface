package servicos;

import entidades.AlguelCarro;
import entidades.Boleto;

import java.time.Duration;
import java.time.LocalDateTime;


public class RendaServicos {

    private Double precoHora;
    private Double precoDia;

    private Taxas tx;

    public RendaServicos(Double precoHora, Double precoDia, Taxas tx) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.tx = tx;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(Double precoDia) {
        this.precoDia = precoDia;
    }

    public void processadorBoleto(AlguelCarro ac) {
        LocalDateTime entrada = ac.getEntrada();
        LocalDateTime saida = ac.getSaida();

        double horaData = Duration.between(entrada, saida).toMinutes();
        double data = horaData/60;
        double pagamentoBasico = 0;
        if (data < 5) {
           pagamentoBasico = Math.ceil(data) * this.getPrecoHora();
        } else {
            pagamentoBasico = Math.ceil(data/24) * this.getPrecoDia();
        }

        double taxa = tx.taxas(pagamentoBasico);
        ac.setBoleto(new Boleto(pagamentoBasico, taxa));
    }
}
