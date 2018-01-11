import java.util.Scanner;
public class NumSum {
	public static void main(String[] args){
		int sum = 1;
		int val = 0;
		
		Scanner kb = new Scanner(System.in);
		while(val != -1){
			val = kb.nextInt();
			sum = sum + val;
		}
		System.out.println("Sum is " + sum);
	}
}
