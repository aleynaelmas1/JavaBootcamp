package conditionals;

public class conditionals {

	public static void main(String[] args) {
		// şart blokları
		int sayi = 15;
		if (sayi<20) {
			System.out.println("Sayı 20'den küçüktür.");
		}
		
		if (sayi<15) {
			System.out.println("Sayı 15'ten küçüktür.");
		}else if (sayi==20) {
			System.out.println("Sayı 20'ye eşittir.");
		} 
		else if (sayi==15) {System.out.println("Sayı 15'e eşittir.");
			
		}
		
		else{System.out.println("Sayı 20'den ve 15'ten büyüktür.");
			
		}

	}

}
