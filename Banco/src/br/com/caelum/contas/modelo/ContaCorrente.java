package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements  Tributavel{
	public String getTipo(){
		return "Conta corrente";
	}
	
	public double getValorImposto(){
		return this.getSaldo() * 0.01;
	}
	
	@Override
	public void saca(double valor){
		super.saca(valor - 0.10);
		
		
	}

}
