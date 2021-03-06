package classes;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String _nome, String _endereco, String _telefone, double _valorCredito, double _valorDivida) {
		super(_nome, _endereco, _telefone);
		this.valorCredito = _valorCredito;
		this.valorDivida = _valorDivida;
		
	}
	
	public Fornecedor() {
		this.valorCredito = 0;
		this.valorDivida = 0;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	
	public void setValorCredito(double valor) {
		valorCredito = valor;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	public void setValorDivida(double valor) {
		valorDivida = valor;
	}
	
	public double obterSaldo() {
		return getValorCredito()-getValorDivida();
	}
	
	public String toString() {
		return "Nome: "+getNome() + "\n" +
				"Nome: "+getEndereco() + "\n" +
				"Telefone: "+getTelefone() + "\n" +
				"Cr�dito: R$ "+getValorCredito() + "\n" +
				"D�vida: R$ "+getValorDivida();
	}
	
}
