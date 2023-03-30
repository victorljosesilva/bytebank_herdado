package bytebank_herdado;

public class AutenticacaoUtil {
	private int senha = 222;
	
	public void verificaAcesso(Autenticavel a) {
		if(a.autentica(senha)) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso negado");
		}
	}
}
