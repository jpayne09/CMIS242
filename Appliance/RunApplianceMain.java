package Appliance;

import java.util.Scanner;

public class RunApplianceMain {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Appliance appliance;
        System.out.println("Which Appliance do you want to select(1: Microwave  2: Fridge)");
        int userSelection = sc.nextInt();

        if(userSelection == 1){
            appliance = new MicrowaveApp("Samsung","Microwave");
            System.out.println(appliance.toString());
        }else{
            appliance = new FridgeAppliance("LG");
            System.out.println(appliance.toString());
        }
        sc.close();
    }  

}
