import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      boolean desejaContinuar = false;
      
      int cont = 0;
      
      do {
        System.out.println(cont);
        cont = cont + 1;
        desejaContinuar = (cont <= 20);
      }while(desejaContinuar);



  }
}