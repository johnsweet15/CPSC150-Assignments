import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args){
		int val;
		int evenCount = 0;
		int oddCount = 0;
		
		System.out.println("Enter 10 numbers:");
		
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			val = kb.nextInt();
			if(val % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("There are " + evenCount + " even numbers and " + oddCount + " odd numbers.");
	}
}
