package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel{
	private Autenticador autenticador;
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senhaCorreta) {
		// TODO Auto-generated method stub
		return this.autenticador.autentica(senhaCorreta);
	}
}
