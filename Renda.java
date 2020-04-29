
package renda;
import java.util.Scanner;

public class Renda {
    public static void main(String[] args) {
        
      Scanner git = new Scanner (System.in);  
        
      Imposto imp1= new Imposto();
      
      System.out.println("Qual o seu salario?");
      imp1.setSalario(git.nextDouble());
      
      System.out.println("R$= " + imp1.calculaImpost());
        
    }
    
}
