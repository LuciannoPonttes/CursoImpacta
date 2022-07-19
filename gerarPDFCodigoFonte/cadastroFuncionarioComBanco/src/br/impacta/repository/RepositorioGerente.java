package br.impacta.repository;

import java.util.ArrayList;
import java.util.List;


import br.impacta.model.Gerente;
import br.impacta.persistence.dao.GerenteDao;

public class RepositorioGerente implements InterfaceGerente {
	
	List<Gerente> listaDeGerentes = new ArrayList<>();
	GerenteDao gerenteDao = new GerenteDao();
	
	
	@Override
	public boolean salvarGerente(Gerente gerente) {
		
			boolean salvo;
			
			//listaDeGerentes.add(gerente);
		
			salvo =	gerenteDao.salvaNoBanco(gerente);
			
		
		
		return salvo;
	}

	@Override
	public List<Gerente> listarGerente() {
		
		return gerenteDao.BuscarListaGerente();
	}

	@Override
	public boolean deletarGerente(String matricula) {
		
		boolean deletado = gerenteDao.deletarPelaMatricula(matricula);
		
		return deletado;
	}

	@Override
	public Gerente buscarGerente(String matricula) {
		
		for(Gerente gerente:gerenteDao.BuscarListaGerente()) {
			if(gerente.getMatricula().equals(matricula)) {
				
				
				return gerente;
			}
			
		}
		
		return null;
	}

	@Override
	public boolean alterarGerente(Gerente gerenteAtual, Gerente gerenteNovo) {
		
		boolean alterado = gerenteDao.alterarGerenteNoBanco(gerenteNovo);
		
		return alterado;
		
	}

	
	
	
}
