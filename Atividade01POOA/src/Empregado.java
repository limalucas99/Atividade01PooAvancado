import java.util.Random;

public class Empregado {
	private int tipo;
    private double salario;
    private double percentualComissao;
    private double bonus;
    private double valorfinal;
    
    //construtor padrão
    
    public double getValorfinal() {
		return valorfinal;
	}

	public void setValorfinal(double valorfinal) {
		this.valorfinal = valorfinal;
	}

	Random gerador = new Random();
    
    public Empregado()
    {
    	
    }
    
    public Empregado(int tipo)
    {
    	this.tipo = tipo;
    }

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
