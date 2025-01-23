import java.util.*;

public class ClasseMain {
  
  public static void main(String[] args) {
    
    int senhaDigitada = 8888;
    
    if (validaSenha(senhaDigitada)){
      System.out.println("Permitido");
    } else{
      System.out.println("Negado");
    }
  }
  
  public static boolean validaSenha(int minhaSenha){
    
    return minhaSenha == 1234;

  }
}
