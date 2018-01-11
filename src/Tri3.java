/*John Sweet and Kevin Mateo
 *10 minutes
 *This program draws a triangle based on the number of rows
 *input by the user 
 */
import java.util.Scanner;
public class Tri3 {
	public static void main(String[] args){
		int rows;
		System.out.println("Enter a number of rows");
        Scanner kb = new Scanner(System.in);
        rows = kb.nextInt();
        
        System.out.print("  |");
        
        for(int i = 0; i < rows; i++)
        	System.out.print("-");
        
        System.out.println("/");
        
        for(int i = rows; i > 0; i--){
        	int diff = rows - i;
        	if(diff < 10){
                System.out.print(" " + (diff));
                System.out.print("|");
        	}
        	else{
        		System.out.print((diff));
                System.out.print("|");
        	}
            for(int j = 1; j < i; j++)
                System.out.print("*");
            System.out.println("/");
        }   	
	}
}
