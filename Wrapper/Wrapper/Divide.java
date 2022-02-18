package Wrapper.Wrapper;

public class Divide {
	
	private double n1;

	private double n2;
	
	public Divide() {
		n1 = Double.NaN;
		n2 = Double.NaN;
	}
	
	public Divide(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double Division() {
		
		return n1/n2;
	}
	
	//Mutators
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public String toString() {
		return "The number " + n1 + "/"+ n2 + " = "+ Division();
	}

}
