import java.util.Scanner;
public class CharQ {
	public static void main(String[] args){
		String str;
		Scanner kb = new Scanner(System.in);
		str = "g";
		char char1 = str.charAt(0);
		
		while(char1 != ('q')){
			str = kb.nextLine();
			if(!str.equals("q"))
				System.out.print(str.charAt(0) + " ");
			else
				System.exit(0);
		}
	}
}
