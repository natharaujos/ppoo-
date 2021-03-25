public class Principal {
    
    public static void main(String[] args) {
        
        NotaFiscal nf = new NotaFiscal(18,1,2021);
    
        CompraNormal cn = new CompraNormal("Geladeira",2,1500,10);
        CompraComCupom ccc1 = new CompraComCupom("Ar Condicionado",1,800,200);
        CompraComCupom ccc2 = new CompraComCupom("Liquidificador",2,90,250);

        nf.comprar(cn);
        nf.comprar(ccc1);
        nf.comprar(ccc2);
    
        nf.imprimirNotaFiscal();
    }
}