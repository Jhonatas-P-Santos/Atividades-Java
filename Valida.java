
package notav;


public class Valida {
    
    private double nota1;
    private double nota2;

    
    public double calculaNot(){
        double media;
        
        media= (nota1+nota2)/2;
        
        return media;
    }
    
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    
}
