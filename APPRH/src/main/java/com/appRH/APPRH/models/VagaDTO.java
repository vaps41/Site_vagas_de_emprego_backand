package com.appRH.APPRH.models;


public class VagaDTO {
	
	private String nome;

	private String salario;

	private String cidade;

	private String setor;

	private String cargo;

	private String contrato;

	private String requisitos_obg;
	
	private String requisitos_desj;
	
	private String descricao;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getRequisitos_obg() {
		return requisitos_obg;
	}

	public void setRequisitos_obg(String requisitos_obg) {
		this.requisitos_obg = requisitos_obg;
	}

	public String getRequisitos_desj() {
		return requisitos_desj;
	}

	public void setRequisitos_desj(String requisitos_desj) {
		this.requisitos_desj = requisitos_desj;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public vaga converter() {
		vaga vaga = new vaga();
		
		vaga.setNome(this.getNome());
		vaga.setSalario(Float.parseFloat(this.getSalario()));
		vaga.setCidade(this.getCidade());
		vaga.setSetor(Integer.parseInt(this.getSetor()));
		vaga.setCargo(this.getCargo());
		vaga.setContrato(this.getContrato());
		vaga.setRequisitos_obg(this.getRequisitos_obg());
		vaga.setRequisitos_desj(this.getRequisitos_desj());
		vaga.setDescricao(this.getDescricao());
		return vaga;
	}
	
	
}
