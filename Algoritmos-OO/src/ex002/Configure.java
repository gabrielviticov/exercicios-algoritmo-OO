package ex002;

import java.util.Scanner;

public class Configure {
	
	protected String nome;
	
	public void configure() {
		Scanner teclado = new Scanner(System.in);
		nome = teclado.nextLine();
	}
}
