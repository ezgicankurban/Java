package ecankurban.obj.hesapmakinesi.kalýtým;

public class IslemYap implements Islem {
	private int sayi1;
	private int sayi2;
	private String operator;

	public void IslemYap(int sayi1,int sayi2, String operator) {
		this.sayi1=sayi1;
		this.sayi2=sayi2;
		this.operator=operator;
		
	}
	@Override
	public int islem() {
		int sonuc;
		
		if(operator.equals("+")) sonuc=sayi1+sayi2;
		else if (operator.equals("-")) sonuc=sayi1-sayi2;
		else if (operator.equals("*")) sonuc=sayi1*sayi2;
		else if (operator.equals("/")) sonuc=sayi1/sayi2;
		else sonuc=0;
		
		return sonuc;
	}
	
	

}
