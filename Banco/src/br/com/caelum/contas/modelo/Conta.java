package br.com.caelum.contas.modelo;

/**
 * 
 * @author Osmar Lago dos Santos
 *
 */

public class Conta {
	private double saldo;
	private String agencia;
	private int numero;
	private String dataDeAbertura;
	private String titular;

	public String getTipo() {
		return "Conta";
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conta(String titular) {
		super();
		this.titular = titular;
	}

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * A variável valor é double.
	 * 
	 * @param valor
	 */

	public void depositar(double valor) {
		this.setSaldo(+valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void sacar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void saca(double valor) {
	
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
	public void transfere(double valor, Conta conta){
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	
		
	

}
