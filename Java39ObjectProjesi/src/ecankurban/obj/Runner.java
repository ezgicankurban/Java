package ecankurban.obj;

public class Runner {

	public static void main(String[] args) {
		
		Arac temp=new Arac();//temp art�k ram de arac i�in ayr�lan yeri tutuyor.
		temp.setKoltuk(true);
		
		temp.setTekerlekSayi(4);
		
		
		//Arac temp1;�uan ram de yer tahsis edilemdi null durumda stack de tutulur.
		Arac temp1=new Arac();//obje �retme i�lemi.new ile nesneye ba�lad���m�z anda ram de yer ay�r�r ve oaraya ba�lar.
		temp.setKoltuk(true);
		temp1.setTekerlekSayi(10);
		temp=temp1;//i�lemi yaparsak art�k ikisi de ram ayn� yeri i�aret eder.temp1 i temp e klonlad�k(atama de�il) biri de�i�irse di�eri de de�i�ir.
		temp.toString();
		
		temp.setTekerlekSayi(5);
		System.out.println(temp.getTekerlekSayisi());
		System.out.println(temp1.getTekerlekSayisi());
		
	}
}
