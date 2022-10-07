package servicos;

public  class BrasilTaxas {

    public double taxa(double valor) {
        if(valor <= 100){
            return valor * 0.2;
        } else {
            return valor * 0.15;
        }
    }
}
