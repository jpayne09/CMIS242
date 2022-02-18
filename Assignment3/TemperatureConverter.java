package Assignment3;

//Temperature COnverter class utilize to convert Fahrenheit to Celsius
public class TemperatureConverter extends Converter{
    
    //Class constructor that inputs the data entry
    public TemperatureConverter(double inputData){
        super(inputData);

    }

    //Default constructor 
    public TemperatureConverter(){

    }

    //Convert method for Fahrenheit to celsius
    @Override
    public double convert(double F) {
        double C;
        if (Double.isNaN(F)){
            return Double.NaN;
        } else {
            C = ((F - 32) * 5) / 9;
            return C;
        }
    }

}
