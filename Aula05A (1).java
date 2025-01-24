import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int nrLanche = 2;
      
      switch (nrLanche) {
        case 1:
          System.out.println("BigMac");
        break;
        case 2:
          System.out.println("MacLanche");
        break;
        case 3:
          System.out.println("MacFeliz");
        break;
        
        //Uso default para quando digitar um valor invalido
        default:
        System.out.println("Valor invalido");
      }
      
  }
}