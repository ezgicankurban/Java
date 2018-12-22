package ecankurban.obj;

public class Runner {

	public static void main(String[] args) {
		
		Arac temp=new Arac();//temp artýk ram de arac için ayrýlan yeri tutuyor.
		temp.koltuk=true;
		temp.setTekerlekSayi(4);
		
		
		Arac temp1=new Arac();
		temp1.koltuk=true;
		temp1.setTekerlekSayi(10);
		temp=temp1;//atama iþlemi yaparsak artýk ikisi de ram ayný yeri iþaret eder.temp1 i temp e klonladýk biri deðiþirse diðeri de deðiþir.
		
		
		temp.setTekerlekSayi(5);
		System.out.println(temp.getTekerlekSayisi());
		System.out.println(temp1.getTekerlekSayisi());
		
	}
}
