package bytebank_herdado;

public abstract class Autenticador {
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senhaCorreta) {
		if(this.senha == senhaCorreta) {
			return true;
		} return false;
	}
}
