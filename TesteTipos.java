public class TesteTipos {

    public static void main(String[] args) {
         
        // Trabalhando com Strings
        String nome = "Bittencourt";
        System.out.println(nome);               // Imprime o valor da string
        System.out.println(nome.length());      // Imprime o comprimento da string (número de caracteres)
        System.out.println(nome.charAt(7));     // Imprime o caractere na posição 7 da string (índice começa em 0)

        // Convertendo Strings para números (double)
        String precoStr01 = "45.75";
        String precoStr02 = "20.25";
        double precoDouble01 = Double.parseDouble(precoStr01);   // Converte a string para double
        double precoDouble02 = Double.parseDouble(precoStr02);   // Converte a string para double
        System.out.println(precoDouble01);                        // Imprime o valor convertido de precoStr01
        System.out.println(precoDouble02);                        // Imprime o valor convertido de precoStr02

        // Realizando a soma de dois valores double
        double somaD = precoDouble01 + precoDouble02;             // Soma dos dois valores double
        System.err.println(somaD);                                 // Imprime a soma no stream de erro (normalmente usado para mensagens de erro)

        // Convertendo o resultado da soma de volta para String
        String somaStr = String.valueOf(somaD);                   // Converte o double para String
        System.out.println(somaStr);                               // Imprime a soma como String

        // Manipulação de String usando split
        String registro = "Dennis;1.81;26;São Paulo";
        String[] vetor = registro.split(";");                      // Divide a string pelo delimitador ";" e armazena em um array
        System.out.println(vetor[0]);                               // Imprime a primeira parte (nome)
        System.out.println(vetor[1]);                               // Imprime a segunda parte (altura)
        System.out.println(vetor[2]);                               // Imprime a terceira parte (idade)
        System.out.println(vetor[3]);                               // Imprime a quarta parte (cidade)
    }
}
