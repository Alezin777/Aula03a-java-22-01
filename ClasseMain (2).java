import java.util.*;

public class ClasseMain {
  
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in); 
      
      System.out.println("Quantas maças você deseja? ");
      
      int qtd = teclado.nextInt();
    
      float valorTotal = calculadora(qtd);

      System.out.println("O valor Total é " 
                    + valorTotal);
    }
    
    public static float calculadora(int q){
      if (q < 12){
        return (q * 0.30f);
      } else {  
        return (q * 0.25f);
      }
    }
    
}