/*
 * Program by John Sweet and Wyatt Kremer
 * 
 * Description: This program takes the title of a web page and three paragraphs given 
 * by the user and turns it into HTML code so that it can be seen in a web browser.
 */

import java.util.Scanner;
public class ToHTML {
	public static void main(String[] args){
		String title;
		String p1;
		String p2;
		String p3;
		
		System.out.println("This program creates HTML code");
		Scanner kb = new Scanner(System.in);
		
		//inputs
		System.out.println("Enter the title of your web page");
		title = kb.nextLine();
		System.out.println("Enter your first paragraph");
		p1 = kb.nextLine();
		System.out.println("Enter your second paragraph");
		p2 = kb.nextLine();
		System.out.println("Enter your third paragraph");
		p3 = kb.nextLine();
		System.out.println("Here is your HTML file");
		
		//HTML code
		System.out.println("<!doctype html>");
		System.out.println("<html lang=\"en\">");
		System.out.println("<head>");
		System.out.println("<meta charset=\"utf-8\">");
		System.out.println("<title>" + title + "</title>");
		System.out.println("</head>");
		System.out.println("<body>");
		System.out.println("<p>" + p1 + "</p>");
		System.out.println("<p>" + p2 + "</p>");
		System.out.println("<p>" + p3 + "</p>");
		System.out.println("</body>");
		System.out.println("</html>");
	}
}
