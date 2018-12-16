package ecankurban.base.ornek3;

public class Odev {

  public Odev() {
	  int a=5;
		int b=5;
		int c=6;
		int sonuc=Toplama(a,b,c);
		int sonuc1=Carpma(a,b,c);
		System.out.println(sonuc);
		System.out.println(sonuc1);
}
  
		

	private int Carpma(int a, int b, int c) {
	
	return a*b*c;
}


	private int Toplama(int a, int b,int c) {
		
		return a+b+c;
	}
	
	

}
