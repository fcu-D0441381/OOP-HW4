package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    NissanTiida hw4=new NissanTiida();
	    System.out.println("Please input a number");
	    Scanner keyin=new Scanner(System.in);
	    int a;
	    a=keyin.nextInt();
	    for(int i=0;i<a;i++)
	    {
	    hw4.times=i+1;
	    hw4.tiida();
	    }
	}

}
