import java.util.Scanner;
public class Backwards {
	public static void main(String[] args){
		String word;
		
		Scanner kb = new Scanner(System.in);
		word = kb.nextLine();
		
		for(int i = word.length() - 1; i >= 0; i--)
			System.out.print(word.charAt(i));
	}
}