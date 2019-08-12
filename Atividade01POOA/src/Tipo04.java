import java.util.Random;

public class Tipo04 extends Empregado{
	 
     
     public double calcularSalarioFinal()
     {
  	   this.setBonus(2000+gerador.nextDouble()*2000);
  	   return this.getBonus();
     }
//tipo04
}
