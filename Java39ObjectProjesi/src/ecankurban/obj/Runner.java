package ecankurban.obj;

public class Runner {

	public static void main(String[] args) {
		
		Arac temp=new Arac();//temp art�k ram de arac i�in ayr�lan yeri tutuyor.
		temp.koltuk=true;
		temp.setTekerlekSayi(4);
		
		
		Arac temp1=new Arac();
		temp1.koltuk=true;
		temp1.setTekerlekSayi(10);
		temp=temp1;//atama i�lemi yaparsak art�k ikisi de ram ayn� yeri i�aret eder.temp1 i temp e klonlad�k biri de�i�irse di�eri de de�i�ir.
		
		
		temp.setTekerlekSayi(5);
		System.out.println(temp.getTekerlekSayisi());
		System.out.println(temp1.getTekerlekSayisi());
		
	}
}
