import java.util.Random;

public class Tipo02 extends Empregado {
	
     
     public double calcularSalarioFinal()
     {
  	   this.setSalario(1500+gerador.nextDouble()*500);
  	   this.setPercentualComissao(gerador.nextDouble());
  	   return this.getSalario()+this.getSalario()*this.getPercentualComissao();
     }
}
