package miniProjeSayiBulma;

public class miniProjeSayiBulma {

	public static void main(String[] args) {
		// Sayı Bulma
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=11;
		boolean varMi=false;
		
		for (int sayi:sayilar) {
			if (sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}

	}

}
