import java.util.Scanner;
public class Loop {
	public static void main(String[] args){
		int userNum;
		
		Scanner kb = new Scanner(System.in);
		userNum = kb.nextInt();
		
		for(int i = userNum; i > 0; i--)
			System.out.println(i);
		
		System.out.print("Blastoff");
	}

}
