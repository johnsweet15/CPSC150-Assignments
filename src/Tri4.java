/*John Sweet and Kevin Mateo
 *10 minutes
 *This program draws a triangle based on the number of rows
 *input by the user 
 */

import java.util.Scanner;
public class Tri4 {
	public static void main(String[] args){
		int rows;
        System.out.println("Enter a number of rows");
        Scanner kb = new Scanner(System.in);
        rows = kb.nextInt();
    
        for(int i = 0; i < rows; i++){
            if(i < 10){
                System.out.print(" "+ i);
                for(int k = i; k < rows; k++){
                	System.out.print(" ");
                }
                System.out.print("/");
            }
            if(i >= 10){
                System.out.print(i);
                for(int k = i; k < rows; k++){
                	System.out.print(" ");
                }
                System.out.print("/");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
        System.out.println("|");
        }
        
        System.out.print("  /");
        for(int i = 0; i < rows; i++)
            System.out.print("_");
        System.out.println("|");
	}
}
