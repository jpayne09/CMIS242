package Week8Discussion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Week8 {
    
    public static void main(String[] args) {
        FileReader data;  
        int row=3,col=3;
        int[][] matrix = new int[row][col];

        try {
            data = new FileReader("c:/users/a218633/Desktop/SDP/Week8Discussion/data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("This file does not exist.");
			System.exit(0);
        }
    
      
        
        
        Scanner data2 = null;
        try {
            data2 = new Scanner( new FileReader("c:/users/a218633/Desktop/SDP/Week8Discussion/data.txt"));
            while(data2.hasNextLine()){
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        matrix[i][j] = Integer.parseInt(data2.nextLine());
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("This file does not exist.");
			System.exit(0);
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("-----");
            for (int j = 0; j < matrix.length; j++) {
                if(j == 0){
                System.out.print("|"+matrix[i][j]);
                }else if(j == 2){
                    System.out.print(+matrix[i][j]+"|");
                }
                else{
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println("");
        }
        
    }
}
