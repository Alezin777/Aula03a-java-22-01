import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    if (validaSenha()){
      System.out.println("Acesso PERMITIDO");
    }else{
      System.out.println("Acesso NEGADO");
    }
      
  }
  
  public static boolean validaSenha(){
    Scanner teclado = new Scanner(System.in);
    
    int senha = 0000;
    do {
      System.out.println("Digite sua senha:");
      senha = teclado.nextInt();
        

    } while (senha != 1234);
    
    System.out.println("Saiu!");
    
    return true;

  }