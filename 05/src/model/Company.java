package model;

import java.util.ArrayList;
import java.util.List;

public class Company {
	//Atributos
	private String nome;
	private String cnpj;
	private List<Employee> employee;
	
	//Construtor
	public Company(String cNome, String cCnpj) {
		this.nome = cNome;
		this.cnpj = cCnpj;
		this.employee = new ArrayList<Employee>();
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public List<Employee> getEmployee(){
		return this.employee;
	}
	
	//Setters
	public void setNome(String cNome) {
		this.nome = cNome;
	}
	
	public void setCnpj(String cCnpj) {
		this.cnpj = cCnpj;
	}
	
	public void addFunctiony(Employee cEmployee, int qtd) {
		if(this.employee.size() < qtd) {
			this.employee.add(cEmployee);
		}
	}
}