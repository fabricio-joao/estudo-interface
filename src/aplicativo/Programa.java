package aplicativo;

import entidades.AlguelCarro;
import entidades.ModeloCarro;
import servicos.BrasilTaxas;
import servicos.RendaServicos;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com informaçoes: ");
        System.out.print("Entre com modelo do carro: ");
        String nomeCar = sc.nextLine();
        ModeloCarro mc = new ModeloCarro(nomeCar);
        System.out.print("Entrada (dd/MM/yyyy hh:mm) ");
        LocalDateTime entrada = LocalDateTime.parse(sc.nextLine(), formatter);
        System.out.print("Saida (dd/MM/yyyy hh:mm) ");
        LocalDateTime saida = LocalDateTime.parse(sc.nextLine(), formatter);
        AlguelCarro ac = new AlguelCarro(entrada, saida, mc);
        System.out.print("Entra com preço por hora: ");
        double hora = sc.nextDouble();
        System.out.print("Entra com preço por dia: ");
        double dia = sc.nextDouble();

        RendaServicos rs = new RendaServicos(hora, dia, new BrasilTaxas());
        rs.processadorBoleto(ac);

        System.out.println("boleto: ");
        System.out.println("Pagamento básico: " + ac.getBoleto().getPagamentoBasico() + "\nTaxas: " + ac.getBoleto().getTaxas() + "\nTotal Pagamento: " + ac.getBoleto().totalPagamento());

    }
}
