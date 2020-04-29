
package renda;


public class Imposto {
    
   private double salario;

   public double calculaImpost(){
       double media = 0;
       if(salario>0 && salario<2000){
           System.out.println("Isento");
       }
       else if(salario>2000 && salario<3000){
           media= (salario*8)/100;
       }
       else if(salario>3000 && salario<4500){
           media= (salario*18)/100;
       }
       else if(salario>4500){
           media= (salario*28)/100;
       }
      return media; 
   }
   
   
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    
    
    
}
