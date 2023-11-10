import java.util.Scanner;

public class deneme16 {

	public static void main(String[] args) {
		System.out.println("Bir sayı giriniz:");
		Scanner scanner = new Scanner(System.in);
	
		while(true) { //(23 girilene kadar) sonsuz bir döngü oluşturdum.
		
			int sayi = scanner.nextInt();
			if(sayi==23) {
				System.out.println("Döngüden çıkılıyor...");
				break;
				/*break içinde bulunduğu döngüyü sonlandırır.
				  if koşulu while döngüsünün içinde olduğundan
				  while döngüsünü sonlandırmış oldu*/
			}
			System.out.println("Bir sayı giriniz:");
		}
          scanner.close();
	}

}

		//0 dan 12 a kadar olan sayıları 3 ve 7 hariç yazdırma
		/*	int i = 0;
		while(i<=12) {
			
				if(i==3 || i==7){
				i++;  	 //bu kısım olmazsa hata verir!!!
				continue;
			}
			
			System.out.println("i= "+i);
			i++;
			
		}
			*/
	