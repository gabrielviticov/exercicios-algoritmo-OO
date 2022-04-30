package ex002;

public class Pessoa extends Configure implements Tela {
	
	public String getNome() {
		return this.nome;
	} 
	
	@Override
	public void pegarNome() {
		super.configure();
	}

	@Override
	public void tela() {
		System.out.println("Como gostaria de ser chamado? ");
		this.pegarNome();
		System.out.println("Olá "+this.getNome()+", prazer em te conhecer!");
	}

}
