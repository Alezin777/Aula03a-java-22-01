import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      String mes = "Fevereiro";
      
      switch (mes) {
        case "Janeiro":
          System.out.println("01");
        break;
        case "Fevereiro":
          System.out.println("02");
        break;
        case "Março":
          System.out.println("03");
        break;
        case "Abriu":
          System.out.println("04");
        break;
        case "Maio":
          System.out.println("05");
        break;
        case "Junho":
          System.out.println("06");
        break;
        case "Julho":
          System.out.println("07");
        break;
        
        //Uso default para quando digitar um valor invalido
        default:
        System.out.println("Numero invalido");
      }
      
  }
}