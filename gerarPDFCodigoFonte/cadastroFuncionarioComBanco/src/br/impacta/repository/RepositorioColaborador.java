package br.impacta.repository;

import java.util.ArrayList;
import java.util.List;


import br.impacta.model.Colaborador;

public class RepositorioColaborador implements InterfaceColaborador {
	
	List<Colaborador> listaDeColaboradors = new ArrayList<>();
	
	
	@Override
	public boolean salvarColaborador(Colaborador Colaborador) {
		
		try {
			//Tenta executar
			listaDeColaboradors.add(Colaborador);
			
		} catch (Exception e) {
			return false;
			
		}
		
		return true;
	}

	@Override
	public List<Colaborador> listarColaborador() {
		
		return listaDeColaboradors;
	}

	@Override
	public boolean deletarColaborador(String matricula) {
		
		for(Colaborador Colaborador:listaDeColaboradors) {
			if(Colaborador.getMatricula().equals(matricula)) {
				
				listaDeColaboradors.remove(Colaborador);
				return true;
			}
			
		}
		
		return false;
	}

	@Override
	public Colaborador buscarColaborador(String matricula) {
		for(Colaborador Colaborador:listaDeColaboradors) {
			if(Colaborador.getMatricula().equals(matricula)) {
				
				
				return Colaborador;
			}
			
		}
		
		return null;
	}

	@Override
	public boolean alterarColaborador(Colaborador ColaboradorAtual, Colaborador ColaboradorNovo) {
		
		for(Colaborador Colaborador: listaDeColaboradors) {
			if(Colaborador == ColaboradorAtual) {
				
				listaDeColaboradors.remove(ColaboradorAtual);
				listaDeColaboradors.add(ColaboradorNovo);
				return true;
			}
			
		}
		
		return false;
		
	}

	
	
	
}
