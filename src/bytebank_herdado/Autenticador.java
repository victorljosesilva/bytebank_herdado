package bytebank_herdado;

public class Autenticador {
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
