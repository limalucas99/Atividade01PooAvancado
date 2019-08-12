import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Teste {
	 public static void main(String[] args) {
	    	
	    	Random gerador = new Random();
	    	Empregado p = new Empregado();
	    	List<Empregado> empregados = new ArrayList<>();
	    	
	    	for(int i=0;i<=10;i++)
	    	{
	    		int tipo = gerador.nextInt(4)+1;
	    		Empregado aux = new Empregado(tipo);
	    		
	    		if(tipo==1)
	    		{
	    			aux.setValorfinal(new Tipo01().calcularSalarioFinal());   			
	    		}
	    		else if(tipo==2)
	    		{
	    			aux.setValorfinal(new Tipo02().calcularSalarioFinal());   
	    		}
	    		else if(tipo==3)
	    		{
	    			aux.setValorfinal(new Tipo03().calcularSalarioFinal());   
	    		}
	    		else
	    		{
	    			aux.setValorfinal(new Tipo04().calcularSalarioFinal());   
	    		}
	    		empregados.add(aux);    		
	    	}    	
	    	for(Empregado e: empregados)
	    	{
	    		System.out.println("Salário = "+e.getValorfinal());
	    	}
		}
	 //teste
}
