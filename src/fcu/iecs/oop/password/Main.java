package fcu.iecs.oop.password;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PasswordEncorder hw4=new PasswordEncorder();
		Scanner keyin=new Scanner(System.in);
		String words;
		boolean i;
		while(true)
		{
		System.out.println("Please input a Password");
		words=keyin.nextLine();
		i=words.equalsIgnoreCase("exit");
		if(i)
		{
			break;
		}
		words=hw4.encode(words);
		System.out.println(words);
		}
	}

}
