package view;

import java.util.Scanner;
import model.Employee;
import model.Company;

public class Main {

    public static void main(String[] args) {
    	
    	int cont = 0;
        	
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Company Name: ");
			String cNome = input.next();

			System.out.print("CNPJ of de Company: ");
			String cnpj = input.next();
			     
			Company company01 = new Company(cNome, cnpj);
			     
			System.out.print("Enter the number of employees the comopany has: ");
			int qtd = input.nextInt();
			     
			while(cont < qtd){
				
				System.out.print("Employee's name: ");
				String eNome = input.next();
			     
			    System.out.print("CPF of the employee: ");
			    String cpf = input.next();

			    System.out.print("Employee Salary: ");
			    double salario = input.nextDouble();
			         
			    Employee employee01 = new Employee(eNome);
			         
			    employee01.setCpf(cpf);
			    employee01.setSalario(salario);
			    
			    System.out.println(company01.getNome());
			    System.out.println(company01.getCnpj());
			    

				System.out.println(employee01.getNome());
				System.out.println(employee01.getCpf());
				System.out.println(employee01.getSalario());
				
				cont++;

			}
		}
    }
}