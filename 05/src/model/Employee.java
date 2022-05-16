package model;

public class Employee {
	private String nome;
	private String cpf;
	private double salario;
	private Company company;
	
	//Construtor da Classe
	public Employee(String eNome) {
		this.nome = eNome;
	}
	
	// Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public Company getCompany() {
		return this.company;
	}
	
	//Setters
	public void setNome(String eNome) {
		this.nome = eNome;
	}

	public void setCpf(String eCpf) {
		this.cpf = eCpf;
	}

	public void setSalario(double eSalario) {
		this.salario = eSalario;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}