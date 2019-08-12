import java.util.Random;

public class Tipo03 extends Empregado{

     
     public double calcularSalarioFinal()
     {
  	   this.setSalario(1200+gerador.nextDouble()*500);
  	   this.setPercentualComissao(gerador.nextDouble());
  	   this.setBonus(500+gerador.nextDouble()*500);
  	   return this.getSalario()+this.getSalario()*this.getPercentualComissao()+this.getBonus();
     }
     //tipo03
}
