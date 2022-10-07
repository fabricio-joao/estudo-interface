package entidades;

public class Boleto {

    private Double pagamentoBasico;
    private Double taxas;

    public Boleto() {
    }

    public Boleto(Double pagamentoBasico, Double taxas) {
        this.pagamentoBasico = pagamentoBasico;
        this.taxas = taxas;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getTaxas() {
        return taxas;
    }

    public void setTaxas(Double taxas) {
        this.taxas = taxas;
    }

    public double totalPagamento(){
        return this.getPagamentoBasico() + this.getTaxas();
    }

    @Override
    public String toString() {
        String info = "Pagamento Basico: " + this.getPagamentoBasico();
        info += "\nTaxa: " + this.getTaxas();
       // info += "Total pagamento: " + this.totalPagamento();
        return info;
    }
}
