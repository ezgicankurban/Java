package ecankurban.base.ornek5;

import java.util.Scanner;



public class ConsolOkuma {
	
	private int sayi;
	private Scanner scan;
	
	public ConsolOkuma() {
		
		scan=new Scanner(System.in);
		
		 System.out.println("Bir sayi giriniz..!");
		 sayi=scan.nextInt();
		 System.out.println("Girdi�iniz sayi:"+sayi);
		 System.out.println("�sminizi Girniz:");
		 String isim=scan.next();
		 System.out.println("�sminiz:"+ isim);
		 scan.close();
		
		
		
	}
	

}
