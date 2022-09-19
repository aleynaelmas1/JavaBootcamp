package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		// Switch Blokları
		char grade = 'A';
		
		switch(grade) {
		case 'A':
		System.out.println("Mükemmel geçtiniz");
		break;
		
		case 'B':
			System.out.println("İyi geçtiniz");
			break;
		
		case 'C':
			System.out.println("Ortalama geçtiniz");
			break;
			
		case 'D':
			System.out.println("Fena değil geçtiniz");
			break;
		
		case 'F':
			System.out.println("Maalesef kaldınız.");
			break;
			
		default:
			System.out.println("Geçersiz not girdiniz");
			
			
		}

	}

}
