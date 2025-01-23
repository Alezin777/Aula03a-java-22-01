import java.util.*;

public class ClasseMain {
  
    public static void main(String[] args) {
      /*conferir a seguencia das variaveis declaradas para seguir a senquencia na funçao tbm*/
      
      float promo = 0.25f;
      float cus_maca = 0.30f;
      int maca_comp = 13;
      float total = func_promo(promo, cus_maca, maca_comp);
      System.out.println("Total da compra: R$" + total);
    }
    
    /*conferir o tipo da variavel declaradas para declaras ela do msm tipo na funçao*/
    public static float func_promo(float a, float b, int c){
      
      if(c < 12){
        return c * b;
      }else{
        return c * a;
      }
      
    }
}