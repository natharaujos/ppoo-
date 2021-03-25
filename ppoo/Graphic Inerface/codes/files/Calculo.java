public class Calculo {

    private String cout = "";
    private String[] vetorAux;
    private int contantion = 0;

    public String calcula(String valor) {

        String[] vetor = valor.split("");
        vetorAux = new String[vetor.length+1];
        String aux = "";
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i].equals("+") || vetor[i].equals("-") || vetor[i].equals("/") || vetor[i].equals("*")) {
                
                vetorAux[contador] = aux;
                contador++;
                vetorAux[contador] = vetor[i];
                aux = "";
                contador++;
            }

            else {

                aux += vetor[i];
            }
        }

        vetorAux[contador] = aux;

        while (vetorAux[contantion] != null) {

            if (vetorAux[contantion].equals("*")) {
                
                Double val1 = Double.parseDouble(vetorAux[contantion-1]);
                Double val2 = Double.parseDouble(vetorAux[contantion+1]);
                Double calcula = (val1*val2);
                vetorAux[contantion-1] = String.valueOf(calcula);
                calcular(contantion);
                calcular(contantion);
                contantion = 0;
                
            }

            contantion++;
        }

        contantion = 0;

        while (vetorAux[contantion] != null) {

            if (vetorAux[contantion].equals("/")) {
                
                Double val1 = Double.parseDouble(vetorAux[contantion-1]);
                Double val2 = Double.parseDouble(vetorAux[contantion+1]);
                Double calcula = (val1/val2);
                vetorAux[contantion-1] = String.valueOf(calcula);
                calcular(contantion);
                calcular(contantion);
                contantion = 0;
                
            }

            contantion++;
        }

        contantion = 0;

        while (vetorAux[contantion] != null) {

            if (vetorAux[contantion].equals("+")) {
                
                Double val1 = Double.parseDouble(vetorAux[contantion-1]);
                Double val2 = Double.parseDouble(vetorAux[contantion+1]);
                Double calcula = (val1+val2);
                vetorAux[contantion-1] = String.valueOf(calcula);
                calcular(contantion);
                calcular(contantion);
                contantion = 0;
                
            }

            contantion++;
        }

        contantion = 0;

        while (vetorAux[contantion] != null) {

            if (vetorAux[contantion].equals("-")) {
                
                Double val1 = Double.parseDouble(vetorAux[contantion-1]);
                Double val2 = Double.parseDouble(vetorAux[contantion+1]);
                Double calcula = (val1-val2);
                vetorAux[contantion-1] = String.valueOf(calcula);
                calcular(contantion);
                calcular(contantion);
                contantion = 0;
                
            }

            contantion++;
        }

        for (int i = 0; i < vetorAux.length; i++) {

            if (vetorAux[i] == null) {
                
                vetorAux[i] = "";
            }

            else {

                cout = cout + vetorAux[i];
            }
        }

        System.out.print(cout);

        return cout;
    }

    public void calcular(int pos) {

        while (vetorAux[pos+1] != null) {

            String opa = "";
            opa = vetorAux[pos+1];
            vetorAux[pos] = opa;
            vetorAux[pos+1] = "#";
            pos++;
        }

        vetorAux[pos] = null;
    }
}
