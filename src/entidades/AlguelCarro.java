package entidades;

import java.time.LocalDateTime;

public class AlguelCarro {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private ModeloCarro modelo;
    private Boleto boleto;

    public AlguelCarro() {
    }

    public AlguelCarro(LocalDateTime entrada, LocalDateTime saida, ModeloCarro modelo) {
        this.entrada = entrada;
        this.saida = saida;
        this.modelo = modelo;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public ModeloCarro getModelo() {
        return modelo;
    }

    public void setModelo(ModeloCarro modelo) {
        this.modelo = modelo;
    }
}
