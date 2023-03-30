package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel{

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senhaCorreta) {
		// TODO Auto-generated method stub
		return false;
	}

}
