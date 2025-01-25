//while é quando vc nao sabe quantas vezes vai repetir. 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
    
      System.out.println("Digite a tabuada desejada: ");
      int tabuada = scanner.nextInt();
      
      int cont = 0;
      
      while (cont <= 10){
        System.out.println( tabuada + " x " + cont + " = " + (cont * tabuada ));
        cont = cont + 1; 
      }




  }
}
