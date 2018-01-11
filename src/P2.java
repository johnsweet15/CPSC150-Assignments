/*
 * John Sweet
 * Edward Street
 */

import java.util.Scanner;

public class P2 {
	public static void main(String[] args){
		String title;
		String p1;
		String p2;
		String p3;
		String f1, f2, f3;
		
		System.out.print("This program creates html code.");
		System.out.println(" You will enter a title and three paragraphs.");
		System.out.print("For each paragraph, you will enter formatting.");
		System.out.println("Enter b for bold, i for italics or n for none.");
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the title of your webpage.");
		title = kb.nextLine();
		System.out.println("Enter your first paragraph.");
		p1 = kb.nextLine();
		System.out.println("Enter the format of your first paragraph.");
		f1 = kb.nextLine();
		System.out.println("Enter your second paragraph.");
		p2 = kb.nextLine();
		System.out.println("Enter the format of your second paragraph.");
		f2 = kb.nextLine();
		System.out.println("Enter your third paragraph.");
		p3 = kb.nextLine();
		System.out.println("Enter the format of your third paragraph.");
		f3 = kb.nextLine();
		
		System.out.println("<!doctype html>");
		System.out.println("<html lang=\"en\">");
		System.out.println("<head>");
		System.out.println("<meta charset=\"utf-8\">");
		System.out.println("<title>" + title + "</title>");
		System.out.println("</head>");
		System.out.println("<body>");
		System.out.println("<p>" + "<"+ f1 + ">" + p1 + "</p>" + "</"+ f1 + ">");
		System.out.println("<p>" + "<"+ f2 + ">" + p2 + "</p>" + "</"+ f2 + ">");
		System.out.println("<p>" + "<"+ f3 + ">" + p3 + "</p>" + "</"+ f3 + ">");
		System.out.println("</body>");
		System.out.println("</html>");
	}
}
