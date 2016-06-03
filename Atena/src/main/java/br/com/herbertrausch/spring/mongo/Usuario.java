package br.com.herbertrausch.spring.mongo;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String nome;
	private String snome;
	private String email;
	private String senha;
	private String generoFavorito;
	private String autorFavorito;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSnome() {
		return snome;
	}
	public void setSnome(String snome) {
		this.snome = snome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getGenero() {
		return generoFavorito;
	}
	public void setGenero(String generoFavorito) {
		this.generoFavorito = generoFavorito;
	}
	public String getAutor() {
		return autorFavorito;
	}
	public void setAutor(String autorFavorito) {
		this.autorFavorito = autorFavorito;
	}

}

