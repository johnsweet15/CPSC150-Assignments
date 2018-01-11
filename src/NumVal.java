import java.util.Scanner;
public class NumVal {
	public static void main(String[] args){
		int count = -1;
		int val = 0;
		
		Scanner kb = new Scanner(System.in);
		while(val != -1){
			val = kb.nextInt();
			count++;
		}
		System.out.println("Number of values: " + count);
	}
}
