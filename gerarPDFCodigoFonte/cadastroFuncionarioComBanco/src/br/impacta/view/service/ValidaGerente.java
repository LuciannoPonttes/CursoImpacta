package br.impacta.view.service;



import java.util.Iterator;

import javax.swing.JTextField;

import br.impacta.model.Gerente;
import br.impacta.repository.RepositorioGerente;




public class ValidaGerente {
	
	public String validarGerente(Gerente gerente, RepositorioGerente repositorio,JTextField horaTrabalhadaTextField) {
		String mensagemErro = null;
		
		if((repositorio.buscarGerente(gerente.getMatricula()) != null)){
			mensagemErro = "Matricula de Gerente Repetida";
			return mensagemErro;
		}
		
		if(!verificaAlfabeto(gerente.getNome())) {
			mensagemErro = "Nome Invalido - Verifique o Alfabeto!!";
			return mensagemErro;
		}
		
		
		if(gerente.getNome().length() > 20){
			mensagemErro = "Maximo de 20 caracteres para o nome do Gerente!";
			return mensagemErro;
		}
		
		if(!verificaAlfabeto(gerente.getCargo())) {
			mensagemErro = "Cargo Invalido - Verifique o Alfabeto!!";
			return mensagemErro;
		}
		if(gerente.getCargo().length() > 15){
			mensagemErro = "Maximo de 15 caracteres para o cargo do Gerente!";
			return mensagemErro;
		}
		
		
		if(gerente.getEmail().length() > 30){
			mensagemErro = "Maximo de 15 caracteres para o email do Gerente!";
			return mensagemErro;
		}
		if(!verificaAlfabeto(gerente.getEstado())) {
			mensagemErro = "Estado Invalido - Verifique o Alfabeto!!";
			return mensagemErro;
		}
		
		if(gerente.getEstado().length() > 10){
			mensagemErro = "Maximo de 10 caracteres para o estado do Gerente!";
			return mensagemErro;
		}
		if(!verificaAlfabeto(gerente.getRegiao())) {
			mensagemErro = "Regiao Invalido - Verifique o Alfabeto!!";
			return mensagemErro;
		}
		
		if(gerente.getRegiao().length() > 10){
			mensagemErro = "Maximo de 10 caracteres para a Regiao do Gerente!";
			return mensagemErro;
		}
		
		if(!validaInteiro(horaTrabalhadaTextField.getText())) {
			mensagemErro = "A hora trabalhada deve ser um Inteiro!!";
			return mensagemErro;
			
		}

		
		return mensagemErro;
		
	}
	
	
	public boolean validaInteiro(String stringInt) {
	
		 int quantidadeDecimal = 10;
		 
		 if(stringInt.isEmpty()) {
			return false;
		 }
		
		 int i;
		 int quantidadeDeCaracteres = stringInt.length();
		 
		 for(i = 0; i < quantidadeDeCaracteres; i++){
			 if(i == 0 && stringInt.charAt(i) == '-' ) {
				 return false;
			 }
			 
			 if(((Character.digit(stringInt.charAt(i), quantidadeDecimal)) < 0)) {
				 return false;
			 }
			
			 
		 }
		
		return true;
		
	}
	
	public boolean verificaAlfabeto(String stringAlfabeto) {
		boolean alfabeto = false;
		
		int i;
		int quantidadeDeCaracteres = stringAlfabeto.length();
		
		for(i = 0; i < quantidadeDeCaracteres; i++) {
			
			if(Character.isAlphabetic(stringAlfabeto.charAt(i))) {
				alfabeto = true;
			}else {
				alfabeto = false;
			}
			
			
		}
		
		
		return alfabeto;
	}
	
	
}
