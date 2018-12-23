package ecankurban.obj;

public class Runner {

	public static void main(String[] args) {
		
		Arac temp=new Arac();//temp artýk ram de arac için ayrýlan yeri tutuyor.
		temp.setKoltuk(true);
		
		temp.setTekerlekSayi(4);
		
		
		//Arac temp1;þuan ram de yer tahsis edilemdi null durumda stack de tutulur.
		Arac temp1=new Arac();//obje üretme iþlemi.new ile nesneye baðladýðýmýz anda ram de yer ayýrýr ve oaraya baðlar.
		temp.setKoltuk(true);
		temp1.setTekerlekSayi(10);
		temp=temp1;//iþlemi yaparsak artýk ikisi de ram ayný yeri iþaret eder.temp1 i temp e klonladýk(atama deðil) biri deðiþirse diðeri de deðiþir.
		temp.toString();
		
		temp.setTekerlekSayi(5);
		System.out.println(temp.getTekerlekSayisi());
		System.out.println(temp1.getTekerlekSayisi());
		
	}
}
