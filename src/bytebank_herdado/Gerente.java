package bytebank_herdado;

public class Gerente extends Funcionario {

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}

}
