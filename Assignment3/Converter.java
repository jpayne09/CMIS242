package Assignment3;

//Converter Class
public abstract class Converter {

    private double inputData;

    public Converter(){
        this.inputData = Double.NaN;
    }

    public Converter(double inputData){
        this.inputData = inputData;
    }
    public double getData(){
        return inputData;
    }
    public void setInputData(double inputData){
        this.inputData = inputData;
    }
    public double convert(double inputData){
        return inputData;
    }

    public String toString() {
		return "The number input is " + inputData + convert(inputData);
	}
}
