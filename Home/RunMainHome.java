package Home;

import java.util.Scanner;

public class RunMainHome 
{
    
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        boolean invalidValue = true;
        int type;
        int numFloors;
        double fee;
        String typeofFloors;
        
        while(invalidValue)
        {
            System.out.print("\nEnter type of house(1:TownHome 2: Single Family House) ");
            type = sc.nextInt();

            switch (type) 
            {
                case 1:
                    System.out.print("Enter number of floors: ");
                    numFloors = sc.nextInt();
                    System.out.print("Enter HOA Fee: ");
                    fee = sc.nextInt();
                    System.out.print("Enter type of flooring: ");
                    typeofFloors = sc1.nextLine();
                    
                
                    try {
                        Home townhome = new TownHome("TownHome", numFloors, fee);
                        townhome.setHomeFloors(numFloors, typeofFloors);
                        System.out.println(townhome.toString());
                        invalidValue = false;
                    } catch (IllegalFloorNumberArgumentException e) {
                        System.out.println("\nTRY AGAIN! Invalid floor number " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter number of floors: ");
                    numFloors = sc.nextInt();
                    System.out.print("Enter General Maintenance Fee: ");
                    fee = sc.nextInt();
                    System.out.print("Enter type of flooring: ");
                    typeofFloors = sc1.nextLine();

                    try {
                        Home sfh = new SingleFamilyHome("Singel Family Home", numFloors,fee);
                        sfh.setHomeFloors(numFloors, typeofFloors);
                        System.out.println(sfh.toString());
                        invalidValue = false;
                    } catch (IllegalFloorNumberArgumentException e) {
                        System.out.println("\nTRY AGAIN! Invalid floor number " + e.getMessage());
                    }
                default:
                    System.exit(0);
                    break;
            }
        }
        sc.close();
        sc1.close();
    }
}
