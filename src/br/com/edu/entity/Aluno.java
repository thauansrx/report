package br.com.edu.entity;

public class Aluno {
	
	private String nome;
	private String RA;
	private Double media;
	private Integer faltas;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	public Integer getFaltas() {
		return faltas;
	}
	public void setFaltas(Integer faltas) {
		this.faltas = faltas;
	}
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", RA=" + RA + ", media=" + media + ", faltas=" + faltas + "]";
	}
	
	

}
