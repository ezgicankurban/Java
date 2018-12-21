package HesapMak;

import java.util.Scanner;

public class Hesapmakine {
	
	public Hesapmakine() {
		MenuGoster();
		MenuDegerAl();
		OndalikSayiAl();
		
		
		
		
		
		double sayi1,sayi2,sonuc;
		int secim,faktoriyel;
		
		do {
			secim=MenuDegerAl();
			
			switch(secim)
			{
			    case 1:
				  sayi1= OndalikSayiAl();
				  sayi2= OndalikSayiAl();
				  sonuc= Toplama(sayi1,sayi2);
				  SonucuGoster(sonuc);
				  
				  break;
				  
			  case 2:
				  sayi1= OndalikSayiAl();
				  sayi2= OndalikSayiAl();
				  sonuc= Cikarma(sayi1,sayi2);
				  SonucuGoster(sonuc);
				  
				  break;
				  
			  case 3:
				  sayi1= OndalikSayiAl();
				  sayi2= OndalikSayiAl();
				  sonuc= Carpma(sayi1,sayi2);
				  SonucuGoster(sonuc);
				  
				  break;
				  
			  case 4:
				  sayi1= OndalikSayiAl();
				  sayi2= OndalikSayiAl();
				  sonuc= Bolme(sayi1,sayi2);
				  SonucuGoster(sonuc);
				  
				  break;
				  
			  case 5:
				  faktoriyel= TamSayiAl();
				  sonuc= Faktoriyel(faktoriyel);
				  SonucuGoster(sonuc);
				  
				  break;
				  
			  default:
				  System.out.println("Teþekkürler..");
			   
			}
				
		} while(secim !=6);
		
		System.out.println("Çýkýþ yaptýnýz..");
		
		
	}


	public static void MenuGoster() {
		
		System.out.println("1-Toplama\n"+
		        "2-Çýkarma\n"+
				"3-Çarpma\n"+
		        "4-Bolme\n"+
				"5-Faktoriyel\n"+
		        "6-Çýkýþ\n");
		
	}
	
	
	public static int MenuDegerAl() {

		
		Scanner input = new Scanner(System.in);
		int sayi;
		
		sayi=input.nextInt();
		while(sayi<1 || sayi<7 ) {
			MenuGoster();
			System.out.println("Seçim yapýnýz..");
			
		}
		
		return sayi;	
	}

	public static double OndalikSayiAl() {
		
		Scanner input = new Scanner(System.in);
		double sayi;
		
		System.out.println("Bir Sayi Giriniz:");
		sayi=input.nextInt();
		
		return sayi;	
	}
	
	public static double Toplama(double num1,double num2) {

		
		return num1+num2;
	}
	
	public static double Cikarma(double num1, double num2) {
		
		return num1-num2;
	}
	
	public static double Carpma(double num1, double num2) {
		
		return num1*num2;
	}
	
	public static double Bolme(double num1, double num2) {
		
		return num1/num2;
	}

	public static int TamSayiAl() {

		
		Scanner input = new Scanner(System.in);
		int sayi;
		
		System.out.println("Bir tam sayi giriniz:");
		sayi=input.nextInt();
		return sayi;
	}
	
	public static int  Faktoriyel(int num) {
		
		int faktoriyel=1;
		for(int i=1;i<=num; i++) {
			faktoriyel*=i;	
		}
		return faktoriyel;
	}

	public static void SonucuGoster(double num) {
		System.out.println("Ýþleminizin sonucu = " + num);
	}

}

