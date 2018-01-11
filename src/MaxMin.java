import java.util.Scanner;
public class MaxMin {
	public static void main(String[] args){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] numbers = new int[10];
		
		System.out.println("Enter 10 numbers:");
		Scanner kb = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = kb.nextInt();
			if(numbers[i] > max)
				max = numbers[i];
			if(numbers[i] < min)
				min = numbers[i];
		}			
			
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}
