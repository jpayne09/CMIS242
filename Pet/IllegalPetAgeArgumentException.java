package Pet;

public class IllegalPetAgeArgumentException extends IllegalArgumentException {

    public IllegalPetAgeArgumentException(int age){

        private String msg;

        if (age < 0)
            msg = "Age  cannot be less than 0";
        else if (age.isBlank())
            msg = "Pet name cannot have all blank values";
        else if (name.isEmpty())
            msg = "Pet name cannot be empty value";

    }
    
}
