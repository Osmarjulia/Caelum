package br.com.caelum.contas.modelo;

public class TestaBanco {
	public static void main(String[] args) {
		Conta c1 = new Conta("Osmar");
		
		c1.depositar (30.0);
		c1.sacar (10);
		
		String nome = c1.getTitular();
		System.out.println(nome);
	}
}
