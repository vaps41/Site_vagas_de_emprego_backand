package com.appRH.APPRH.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.NotEmpty;

@Entity
public class vaga implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codigo;
	
	private String nome;
	
	private float salario;
	
	private String cidade;
	
	private int setor;
	
	private String cargo;
	
	private String contrato;
	
	private String requisitos_obg;
	
	private String requisitos_desj;
	
	private String descricao;


	public long getCodigo() {
		return codigo;
	}


	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public int getSetor() {
		return setor;
	}


	public void setSetor(int setor) {
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
	
	

	
}
 