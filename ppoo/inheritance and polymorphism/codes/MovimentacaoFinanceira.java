public class MovimentacaoFinanceira{
  private static double[] taxaFixa = {100,200,300,400,500,600,700,800,900,1000,1100,1200};
  private int dia;
  private int mes;
  private int ano;
  private String horario;
  private double valor;
  
  public MovimentacaoFinanceira(int dia, int mes, int ano, String horario, double valor){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    this.horario = horario;
    this.valor = valor;
  }
  
  public int getDia(){
    return dia;
  }
  
  public int getMes(){
    return mes;
  }
  
  public int getAno(){
    return ano;
  }
  
  public String getHorario(){
    return horario;
  }
  
  public double getValor(){
    return valor;
  }

  public double getTaxa() {

    return taxaFixa[getMes()-1];
  }
}
  
