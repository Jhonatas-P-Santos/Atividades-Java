
package notav;

import java.util.Scanner;

public class NotaV {

    
    public static void main(String[] args) {
       
        Scanner git = new Scanner (System.in);
       
        Valida not1 = new Valida();
        
        do{
          
        if(not1.calculaNot()<0 && not1.calculaNot()>10){
        
        System.out.println("Digite a primeira nota:");
         not1.setNota1(git.nextDouble());
         
        System.out.println("Digite a segunda nota:");
         not1.setNota2(git.nextDouble());
         
         System.out.println("Media:" + not1.calculaNot());
        }
        else{
        System.out.println("Nota Invalida"); 
         }
        }while(not1.calculaNot()<0 && not1.calculaNot()>10.0)  
    }
}
