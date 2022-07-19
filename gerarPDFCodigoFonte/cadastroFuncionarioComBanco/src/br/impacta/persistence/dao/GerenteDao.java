package br.impacta.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.impacta.persistence.*;


import br.impacta.model.Gerente;


public class GerenteDao {

public boolean salvaNoBanco(Gerente gerente) {
		
		boolean salvo;
	
		String sql = "INSERT INTO gerente (matricula, nome, email, estado, cargo, regiao, salario) VALUES(?,?,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = FabricaDeConexao.criaConexaoComMySql();
			
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			
			pstm.setString(1,gerente.getMatricula());
			pstm.setString(2,gerente.getNome());
			pstm.setString(3,gerente.getEmail());
			pstm.setString(4,gerente.getEstado());
			pstm.setString(5,gerente.getCargo());
			
			pstm.setString(6,gerente.getRegiao());
			pstm.setDouble(7,gerente.getSalario());
			
			pstm.execute();
			
			System.out.println("Gerente Salvo com Sucesso!!");
			salvo = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro na DAO - SALVAR");
			salvo = false;
		}finally {
			
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
					
				}
			}catch(Exception e){
				
				e.printStackTrace();
				
			}
			
		}
		
		return salvo;
		
	}


	public List<Gerente> BuscarListaGerente(){
	
		String sql = "SELECT * FROM gerente";
		List<Gerente> gerentes = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			conn = FabricaDeConexao.criaConexaoComMySql();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = 	pstm.executeQuery();
			
			while(rset.next()) {
				Gerente gerente = new Gerente();
				
				
				
				gerente.setMatricula(rset.getString("matricula"));
				gerente.setNome(rset.getString("nome"));
				gerente.setEmail(rset.getString("email"));
				gerente.setEstado(rset.getString("estado"));
				gerente.setCargo(rset.getString("cargo"));
				gerente.setRegiao(rset.getString("regiao"));
				gerente.setSalario(rset.getDouble("salario"));
				gerentes.add(gerente);
		
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu problema no listar!!");
		}finally {
			
			 
				try {
					if(rset != null) {
						rset.close();
					}
					
					if(pstm != null) {
						pstm.close();
					}
					
					if(conn != null) {
						conn.close();
					}
					
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
		}
		
		return gerentes;
	
	}
	
	public boolean deletarPelaMatricula(String matricula) {
		String sql = "DELETE FROM gerente WHERE matricula = ?";
		
		boolean deletado = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = FabricaDeConexao.criaConexaoComMySql();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, matricula);
			pstm.execute();
			deletado = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro no deletar.");
		}finally {
			try {
				if(pstm != null) {
					pstm.close();	
				}
				
				if(conn != null) {
					conn.close();	
				}
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Deu erro na hora de fechar conexão");
			}
			
			
		}
		return deletado;
		
		
	}
	
	
	public boolean alterarGerenteNoBanco(Gerente gerente) {
		String sql = "UPDATE gerente SET matricula = ?,nome = ?, email = ?, estado = ?,cargo = ?, regiao = ?   WHERE matricula = ? ";
	
		boolean alterado = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = FabricaDeConexao.criaConexaoComMySql();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, gerente.getMatricula());
			pstm.setString(2, gerente.getNome());
			pstm.setString(3, gerente.getEmail());
			pstm.setString(4, gerente.getEstado());
			pstm.setString(5, gerente.getCargo());
			pstm.setString(6, gerente.getRegiao());
			
			pstm.setString(7, gerente.getMatricula());
			
			
			
			pstm.execute();
			alterado = true;
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro no UPDATE");
		}finally {
			try {
				if(pstm != null) {
					pstm.close();	
				}
				
				if(conn != null) {
					conn.close();	
				}
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Deu erro na hora de fechar conexão");
			}
			
			
		}
		return alterado;
		
	}
	
	
	
	
	
	
}
