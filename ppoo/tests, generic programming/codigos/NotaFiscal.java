import java.util.ArrayList;

import java.util.Collections;

public class NotaFiscal {
    
    private int dia;
    private int mes;
    private int ano;
    private ArrayList<Compra> listaDeCompras;

    public NotaFiscal(int dia, int mes, int ano) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        listaDeCompras = new ArrayList<Compra>();
    }

    public int getDia() {

        return dia;
    }

    public int getMes() {

        return mes;
    }

    public int getAno() {

        return ano;
    }

    public void comprar(Compra Comprei) {

        listaDeCompras.add(Comprei);
    }

    public void imprimirNotaFiscal() {

        System.out.printf("Data : %d/%d/%d%n", getDia(), getMes(), getAno());
        System.out.printf("%-15s\t%s\t%-8s\t%s%n%n","Produto","Qtd","Preço","Valor Pago");
        double resultado = 0;
        Collections.sort(listaDeCompras);

        for (Compra Comprei : listaDeCompras) {

            System.out.println(Comprei);
            Compra q = (Comprei);
            resultado += q.calculaDesconto();
        }

        System.out.printf("Valor Total: %.2f", resultado);
    }
}
