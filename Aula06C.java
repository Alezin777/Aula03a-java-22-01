/*
Faça um programa de avalie todoos os numeros entre 8 e 42, 
imprimindo apenas os impares 
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    
    int num1 = 8;
    
    while(num1 <=42){
      int resto = (num1 % 2);// e o parametro tem que ser feito dentro do if
      if(resto == 1){ //if(resto != 0) <--- tbm funciona
        System.out.println(num1);  
      }
      
      
      num1 = num1 + 1;//o contador tem que ser chamado fora do if 
    }
    
  /*
  Imprima 30 numeros e a cada 5 imprima "XAXA"
  */
    
     /*
     int cont = 1;
      while (cont <= 30){
        
        System.out.println(cont);
        int resto = (cont % 5);
        //System.out.println("Resto = " + resto);
        if (resto == 0){
          System.out.println("Xaxa");
        }
          
        cont = cont + 1;
      }

    }
  }*/
    
    
    /*
    
    int i = 0;
    int y = 0;
    
    while (i < 30){
      i++;
      if(y == 5){
        System.out.println("XAXA");
        y = 0;
      }
      y++;
       System.out.println(i);
    }*/
      
    }
  }