package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double hours;
	private Double valuePerHours;
	
	
	
	public Employee() {
		
	}


	public Employee(Integer id, String name, Double hours, Double valuePerHours ) {
		
		this.id = id;
		this.name = name;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public Double getHours() {
		return hours;
	}


	public void setHours(Double hours) {
		this.hours = hours;
	}


	public Double getValuePerHours() {
		return valuePerHours;
	}


	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}

   // metodo para calcular o salario do funcionario
	public double Payment() {
		
	return hours * valuePerHours;
	}

}
