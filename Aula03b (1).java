import java.util.*;

public class ClasseMain {
  
    public static void main(String[] args) {
      int num1 = 50;
      int num2 = 20;
      int total = soma(num1 , num2);  
      int total1 = sub(num1 , num2);
      int total2 = sub_maior(num1, num2);
      System.out.println("---------soma---------");
      System.out.println(total);
      System.out.println("---------sub---------");
      System.out.println(total1);
      System.out.println("---------sub_maior---------");
      System.out.println(total2);
      
    }
    
     public static int soma( int a, int b){
     return a + b;
   }
   
     public static int sub(int a, int b){
     return a - b;
   }
   
   public static int sub_maior(int a, int b){
  
     if(a < b){
       return a - b;
     }else{
       return b - a;
     }
     
}
}