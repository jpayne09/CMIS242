package Assignment3;

//Distance class 
public class DistanceConverter extends Converter {

    public DistanceConverter(double inputData){
        super(inputData);
    }

    public DistanceConverter(){

    }

    //Method to convert miles to kilometers
    @Override
    public double convert(double M) {
        double KM;

        if (Double.isNaN(M)) {
            return Double.NaN;
        } else {
            KM = (M * 1.609);
            return KM;
        }
    }


    
}
