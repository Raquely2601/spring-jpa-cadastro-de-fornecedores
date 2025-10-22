package com.example.demo.entity;

public class Fornecedor {

	private Long id;

	private String razaoSocial;

	private String nomefantasia;

	private String cnpj;

	private String endereco;

	private String fone;

	private String email;

	private String IncricaoEducacional;

	public Fornecedor() {

	}

	public Fornecedor(long id, String razapSocial, String nomeFantasia, String cnpj, String endereço, String fone,
			String email, String inscricaoEducacional, String razaoSocial, String endereco) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomefantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fone=(fone);
		this.email=(email);

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomefantasia() {
		return nomefantasia;
	}

	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIncricaoEducacional() {
		return IncricaoEducacional;
	}

	public void setIncricaoEducacional(String incricaoEducacional) {
		IncricaoEducacional = incricaoEducacional;
	}
	
	

}