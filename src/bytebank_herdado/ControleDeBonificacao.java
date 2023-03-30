package bytebank_herdado;

public class ControleDeBonificacao {
	private double total;
	
	public void registraFuncionario(Funcionario f) {
		this.total += this.total + f.getBonificacao();
	}
	
	public double getTotal() {
		return this.total;
	}
}
