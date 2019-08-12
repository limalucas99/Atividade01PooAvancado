import java.util.Random;

public class Tipo01 extends Empregado{
          
           
           public double calcularSalarioFinal()
           {
        	   this.setSalario(2500+gerador.nextDouble()*700);
        	   return this.getSalario();
           }
}
