package ecankurban.base.toplama;

import java.util.Scanner;

public class Toplam {
	
	private int sayi;
	private int sayi1;
	private Scanner scan;
	
	public Toplam() {
		
		scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz..!");
		 sayi=scan.nextInt();
		 System.out.println("Bir sayi giriniz..!");
		 sayi1=scan.nextInt();
		 
		 int top=sayi + sayi1;
		 System.out.println(top);
	}
	

}
