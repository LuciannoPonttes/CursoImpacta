package br.impacta.view.service;


import br.impacta.model.Colaborador;
import br.impacta.repository.RepositorioColaborador;

	
public class ValidaColaborador {
	
	public String validarColaborador(Colaborador Colaborador, RepositorioColaborador repositorio) {
		String mensagemErro = null;
		
		if((repositorio.buscarColaborador(Colaborador.getMatricula()) != null)){
			mensagemErro = "Matricula de Colaborador Repetida";
			return mensagemErro;
		}
		if(Colaborador.getNome().length() > 20){
			mensagemErro = "Maximo de 20 caracteres para o nome do Colaborador!";
			return mensagemErro;
		}
		if(Colaborador.getCargo().length() > 15){
			mensagemErro = "Maximo de 15 caracteres para o cargo do Colaborador!";
			return mensagemErro;
		}
		if(Colaborador.getEmail().length() > 30){
			mensagemErro = "Maximo de 15 caracteres para o email do Colaborador!";
			return mensagemErro;
		}
		if(Colaborador.getEstado().length() > 10){
			mensagemErro = "Maximo de 10 caracteres para o estado do Colaborador!";
			return mensagemErro;
		}
		if(Colaborador.getLoja().length() > 10){
			mensagemErro = "Maximo de 10 caracteres para a Regiao do Colaborador!";
			return mensagemErro;
		}

		
		return mensagemErro;
	}
	
	
}
	