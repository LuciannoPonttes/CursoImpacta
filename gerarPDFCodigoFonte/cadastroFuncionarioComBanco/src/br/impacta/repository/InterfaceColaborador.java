package br.impacta.repository;

import java.util.List;

import br.impacta.model.Colaborador;





public interface InterfaceColaborador {

	//metodos obrigatorios
	public boolean salvarColaborador(Colaborador colaborador);
	public List<Colaborador> listarColaborador();
	public boolean deletarColaborador(String matricula);
	public Colaborador buscarColaborador(String matricula);
	public boolean alterarColaborador(Colaborador ColaboradorNovo, Colaborador ColaboradorAtual);
	
	
}
