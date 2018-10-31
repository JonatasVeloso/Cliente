package com.jonatas.cliente.models;

import java.util.Date;

public abstract class Cliente {
	
	private String usuario;
	private String telefone;
	private String email;
	private String senha;
	private char tipo; // J/F Jurídica ou Física
	private int quantidadeAcesso; 
	private Date dtCadastro;
	private boolean ativo;
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public int getQuantidadeAcesso() {
		return quantidadeAcesso;
	}
	public void setQuantidadeAcesso(int quantidadeAcesso) {
		this.quantidadeAcesso = quantidadeAcesso;
	}
	public Date getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
