/*John Sweet and Kevin Mateo
 *45 minutes
 *This program draws a Christmas tree based on the number of rows
 *input by the user 
 */

import java.util.Scanner;
public class Tri5 {
	public static void main(String[] args){
		int rows;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number of rows");
		rows = kb.nextInt();
		
		for(int i = 0; i < rows; i++){
			if(i == 0){
				System.out.print(" 0");
				for(int m = 0; m < rows; m++){
					System.out.print(" ");
				}
				System.out.println("/\\");
			}
			
			else{
				if(i < 10){
					System.out.print(" " + i);
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
	            	System.out.print("**");
	            }
	            System.out.println("\\");
			}
		}
		
		for(int i = -2; i < rows; i++){
			System.out.print(" ");
		}
		System.out.println("||");
	}
}
