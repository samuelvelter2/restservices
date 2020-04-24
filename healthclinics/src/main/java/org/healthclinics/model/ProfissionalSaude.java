package org.healthclinics.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name ="TB_profissisonal_saude")
public class ProfissionalSaude extends Usuario{
	private String nomeprofsau;
	private String sobrenomeprof;
	private String crm;
	private String cpf;
	private String RG;	
	@ManyToMany
	private Set<Especializacao> especializacoes;
	@ManyToMany
	private Set<Clinica> clinicas;
	private String numeroCelular;
	private String dataNascimento;
	public String getNomeprofsau() {
		return nomeprofsau;
	}
	public void setNomeprofsau(String nomeprofsau) {
		this.nomeprofsau = nomeprofsau;
	}
	public String getSobrenomeprof() {
		return sobrenomeprof;
	}
	public void setSobrenomeprof(String sobrenomeprof) {
		this.sobrenomeprof = sobrenomeprof;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}	
	public String getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Set<Clinica> getClinicas() {
		return clinicas;
	}
	public void setClinicas(Set<Clinica> clinicas) {
		this.clinicas = clinicas;
	}
	public Set<Especializacao> getEspecializacoes() {
		return especializacoes;
	}
	public void setEspecializacoes(Set<Especializacao> especializacoes) {
		this.especializacoes = especializacoes;
	}
	@Override
	public String toString() {
		return "ProfissionalSaude [nomeprofsau=" + nomeprofsau + ", sobrenomeprof=" + sobrenomeprof + ", crm=" + crm
				+ ", cpf=" + cpf + ", RG=" + RG + ", especializacoes=" + especializacoes + ", clinicas=" + clinicas
				+ ", numeroCelular=" + numeroCelular + ", dataNascimento=" + dataNascimento + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
