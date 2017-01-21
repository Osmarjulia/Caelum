package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
	private double valor;
	private String titular;
	private int numeroApolice;
	
public double getValorImposto() {
	return 42 + this.valor * 0.02;
	// getters e setters para os atributos
}

public void setTitular(String string) {
	// TODO Auto-generated method stub
	
}

public void setNumeroApolice(int int1) {
	// TODO Auto-generated method stub
	
}

public void setValor(double double1) {
	// TODO Auto-generated method stub
	
}

@Override
public String getTitular() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getTipo() {
	// TODO Auto-generated method stub
	return null;
}

}
