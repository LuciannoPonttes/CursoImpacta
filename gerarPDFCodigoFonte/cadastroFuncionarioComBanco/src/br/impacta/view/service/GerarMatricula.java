package br.impacta.view.service;

import br.impacta.repository.RepositorioGerente;

public class GerarMatricula {

	
	RepositorioGerente repositorioGerente = new RepositorioGerente();
	public String gerarMatriculaGerente() {
		String matriculaGerada = null;
		int quantidadeGerentes = repositorioGerente.listarGerente().size();
		quantidadeGerentes++;
		
		matriculaGerada = ("IMPGE00" +quantidadeGerentes);
		
		return matriculaGerada;
	}
	
}
