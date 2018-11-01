package com.jonatas.cliente.repositories;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jonatas.cliente.models.PessoaFisica;

public class ClienteDAO {
	
	private String sql;
	
	
	public void adiciona(PessoaFisica cliente) {
		
		Connection con = new ConnectionFactory().getConnection();
		
		sql = "INSERT INTO JVADM.T_CLI_CLIENTE "
				+ "(CLI_CLIENTE_CODIGO, CLI_CLIENTE_NOME, CLI_CLIENTE_TELEFONE, "
				+ "CLI_CLIENTE_EMAIL ,CLI_CLIENTE_SENHA, CLI_CLIENTE_TIPO, "
				+ "CLI_CLIENTE_CPF) VALUES (?,?,?,?,?,?,?)";
		try{
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getUsuario());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getTelefone());
			stmt.setString(4, cliente.getEmail());
			stmt.setString(5, cliente.getSenha());
			stmt.setLong(6, cliente.getTipo());
			stmt.setString(7, cliente.getCpf());
			stmt.executeUpdate();
			stmt.close();
		}catch(SQLException e) {
			throw new RuntimeException("Erro ao inserir: " + e);
		}
		
	}
}
