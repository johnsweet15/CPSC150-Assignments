import java.util.Scanner;
public class Average500 {
	public static void main(String[] args){
		int val;
		int total = 0;
		int count = 0;
		double average;
		
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < 500; i++){
			val = kb.nextInt();
			total = total + val;
			count++;
		}
		average = (double) total / count;
		System.out.println("Average is: " + average);
	}
}
