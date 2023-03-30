package bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel {
	private int senha;
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senhaCorreta) {
		// TODO Auto-generated method stub
		return 0;
	}

}
