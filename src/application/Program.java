package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>(); 
		
		System.out.print("Enter the number of employees:  ");
		int n=sc.nextInt();  // vai ler o numero de funcionario e vai guardar na variavel "n"
		
		//para ler 'n' funcionarios
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Employee #: " + i + " Data ");
			System.out.print("Outsourced : ( Y/N )");
			char ch =sc.next().charAt(0);  // vai receber o (Y/N) da resposta
			
			// vai ler os dados do employee 
			
			System.out.print("Enter ID of employee: ");
			sc.nextLine();
			int id=sc.nextInt();
			
			System.out.print("Enter of Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			
			System.out.print("Enter of Hours: ");
			//sc.nextLine();
			double hours=sc.nextDouble();
			
			System.out.print("Enter of value per Hours: ");
			double valuePerHours=sc.nextDouble();
			
			
			if (ch == 'y') {
				
				System.out.print("Additional Charge: "); // SE O FUNCIONARIO FOR TERCERIZADO
				
				double additionalCharge=sc.nextDouble();
				
				// PODE COLOCAR O OBJETO 'NEW OUTSOURCEEMPLOYEE' DENTRO DO METODO list.ADD();
				
				Employee emp = new OutsourceEmployee(id, name, hours, valuePerHours, additionalCharge);			
				list.add(emp);
				System.out.println();
			}
			   // SE NÃO FOR TERCERIZADO
			else { //PODE COLOCAR O OBJETO 'NEW EMPLOYEE' DENTRO DO METODO list.ADD();
				Employee emp = new Employee(id, name, hours, valuePerHours);
				list.add(emp);
			}
		}
	
	// imprimir o resultado na tela
		System.out.println();
		System.out.println("PAYMENTS: ");
		System.out.println();
		
		for( Employee emp : list) {
			System.out.println( "ID -" + emp.getId() + "- "  + emp.getName() + ": $ " 
					                       + String.format("%.2f" , emp.Payment()));
					                       			                      
		}
		sc.close();
	}

}
