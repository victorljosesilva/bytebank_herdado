package bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autentica() {
		// TODO Auto-generated method stub
		return false;
	}

}
