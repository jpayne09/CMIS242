package Gift;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class OrderSystem{


    private ArrayList<Gift> gifts = new ArrayList<>();

    public void orderGift(int giftSelection, char size, boolean asccIncluded) {
        String orderID = randomID().toString();
        int numberofFruits = getFruits(size);
        if(giftSelection == 1){
            Gift gift1 = new FruitBasket(orderID, size,numberofFruits, asccIncluded);
            gifts.add(gift1);
            gift1.setPrice(size);
            System.out.print(gift1.toString());
        }else{
            SweetsBasket gift2 = new SweetsBasket(orderID, size, asccIncluded);
            gifts.add(gift2);
            gift2.setPrice(size);
            System.out.print(gift2.toString());
        }

    }

    public StringBuilder randomID() {
        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 5;

        for(int i = 0; i < length; i++) {

        // generate random index number
        int index = random.nextInt(alphabet.length());

        // get character specified by index
        // from the string
        char randomChar = alphabet.charAt(index);

        // append the character to string builder
        sb.append(randomChar);
        }
        return sb;
    }
    public void changeGift(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Is the gift a Fruit Basket(1) or Sweets(2)");
        int key = sc3.nextInt();
        switch (key) {
            case 1:
            for (Gift g : gifts){
                System.out.println("The current size is" + g.getSize() + "What size do you want ? S, M, L");
                char newSize = sc3.next().charAt(0);
                g.setSize(newSize);
                g.setPrice(newSize);
                g.setnumberofFruits(getFruits(newSize));
    
                System.out.println("The current citrus is : " + g.getfruitIdc() + " Do you want to change the citrus? true/false");
                boolean newCitrus = sc3.nextBoolean();
                g.setfruitIdc(newCitrus);
                }
                break;
            case 2:
            for (Gift g : gifts){
                System.out.println("The current size is" + g.getSize() + "What size do you want ? S, M, L");
                char newSize = sc3.next().charAt(0);
                g.setSize(newSize);
                g.setPrice(newSize);
                System.out.println("The current nuts is : " + g.getnutsIncluded() + " Do you want to change the nuts? true/false");
                boolean newNuts = sc3.nextBoolean();
                g.setnutsIncluded(newNuts);
                }
            default:
                break;
        }

    }
    public void displayGift(int id) {
        // Check if id in list
        int positive = 0;
        for (Gift fruits : gifts) {
                    System.out.print(fruits.toString());
                    //System.out.println("Gift Id: " + fruits.getId() +  "Gift Size:" + fruits.getSize() +  " Gift Price: " + fruits.getPrice());
                    positive++;           
        }
        if(positive != 1){
            System.out.println("Sorry, not found.");
        }
    }

    public int getFruits(char size){
        int numberofFruits;
        if(size == 'S'){
            numberofFruits = 6;
        }else if(size =='M'){
            numberofFruits = 9;
        }else{
            numberofFruits = 15;
        }
    return numberofFruits;
    }

    public void displayMenu(){
        System.out.println("1: Order a gift");
        System.out.println("2: Change a gift");
        System.out.println("3: Display gift");
        System.out.println("9: Exit program");
    }

    public void selectOption(int c){
        Scanner sc1 = new Scanner(System.in);
        switch (c) {
            case 1:
                System.out.println("Do you want Fruit Basket (1) or Sweets basket (2)");
                int fruitOption = sc1.nextInt();
                System.out.println("What size do you want: S, M, or L");
                char fruitSize = sc1.next().charAt(0);
                if(fruitOption == 1){
                    System.out.println("Do you want citrus fruits included? true/false");
                    boolean fcitrusIncluded = sc1.nextBoolean();
                    orderGift(fruitOption, fruitSize, fcitrusIncluded);
                }else{
                    System.out.println("Do you want nuts included? true/false");
                    boolean fnutsIncluded = sc1.nextBoolean();
                    orderGift(fruitOption, fruitSize, fnutsIncluded);
                }
                break;
            case 2:
                changeGift();
                break;
            case 3:
                int id = 1;
                displayGift(id);
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
    public static void main(String[] args) {
        OrderSystem run = new OrderSystem();
        
        Scanner stdin = new Scanner(System.in);
        int selection = 0;
        do{
            run.displayMenu();

            System.out.print("Enter your selection :");
            selection = stdin.nextInt();

            run.selectOption(selection);
        }while(selection != 9 || selection == 9);
        stdin.close();
    }
}
