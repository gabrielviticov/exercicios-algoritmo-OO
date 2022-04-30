package ex001;

public class Mensagem implements Tela{
	private String mensagem;
	
	public Mensagem() {
		this.setMensagem("Olá, Mundo!");
	}
	
	private String getMensagem() {
		return this.mensagem;
	} private void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public void tela() {
		System.out.println(this.getMensagem());
	}
}
