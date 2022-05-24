package projee;
import java.util.Scanner;
public class cıftsayıtopla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scan = new Scanner(System.in);
				int toplam = 0;
				System.out.println("Kaçıncı sayıya kadar olan çift sayıların toplamını istiyorsunuz: ");
				int deger = scan.nextInt();
				int i = 0;
				while (i < deger) {
					if (i % 2 == 0) {
						toplam += i;
					}
					i++;
				}
				System.out.printf("%d e kadar olan çift sayılar toplamı: %d", deger, toplam);
			


	}
}


