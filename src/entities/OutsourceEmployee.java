package entities;

public class OutsourceEmployee extends Employee{
	
	
	private Double additionalCharge;

	public OutsourceEmployee() {
		super();
	}
	
	public OutsourceEmployee(Integer id, String name,Double hours, Double valuePerHours, Double additionalCharge) {
		super(id, name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	
    @Override
    // metodo para calcular o adicional de 110% do  funcionario, 
    public double Payment() {
    	return super.Payment() + additionalCharge * 1.1; 
    }
}
