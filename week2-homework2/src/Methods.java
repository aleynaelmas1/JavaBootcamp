
public class Methods {

	public static void main(String[] args) {
		// Metotlar
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}
	
	
	public static void sayiBulmaca() {
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=11;
		boolean varMi=false;
		
		for (int sayi:sayilar) {
			if (sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		String mesaj="";
		if (varMi) {
			mesajVer ("Sayı mevcuttur."+ aranacak);
		}else {
			mesajVer("Sayı mevcut değildir"+ aranacak);
		}
	
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	}


