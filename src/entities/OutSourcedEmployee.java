package entities;

public class OutSourcedEmployee extends Employee {
	
	private Double additionalCharge;

	public OutSourcedEmployee() {
		super();
	}
	
	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	//sobrescrita do método payment da classe Employee
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}