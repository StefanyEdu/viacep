package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cep {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	private String cep;
	private String cidade;
	private String rua;
	private String estado;

	protected Cep() {
		
	}

	public Cep( String cep, String cidade, String rua, String estado) {
		this.cep = cep;
		this.cidade = cidade;
		this.rua = rua;
		this.estado = estado;
		this.id = null;
	}



	public void setId(Long id) {
		this.id = id;
	}

	@Override
    public String toString() {
        return String.format(" CEP[id=%d, cep='%s',rua='%s', cidade='%s',estado='%s']",id, cep,rua,cidade,estado);
    }

	public Long getId() {
		return id;
	}



	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
}
