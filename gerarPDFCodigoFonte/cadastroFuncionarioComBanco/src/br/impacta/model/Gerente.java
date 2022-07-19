package br.impacta.model;

public class Gerente extends Funcionario {
	private String regiao;

	
	
	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	@Override
	public double calcularSalario(int horasTrabalhadas) {
		double salarioCalculo = horasTrabalhadas * 50;
		return salarioCalculo;
	}
	
	
	
	
}
