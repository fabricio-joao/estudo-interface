package servicos;

public  class BrasilTaxas implements Taxas{

    @Override
    public double taxas(double valor) {
        if(valor <= 100){
            return valor * 0.2;
        } else {
            return valor * 0.15;
        }
    }
}
