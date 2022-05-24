package projee;
import java.util.Scanner;
public class cýftsayýtopla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scan = new Scanner(System.in);
				int toplam = 0;
				System.out.println("Kaçýncý sayýya kadar olan çift sayýlarýn toplamýný istiyorsunuz: ");
				int deger = scan.nextInt();
				int i = 0;
				while (i < deger) {
					if (i % 2 == 0) {
						toplam += i;
					}
					i++;
				}
				System.out.printf("%d e kadar olan çift sayýlar toplamý: %d", deger, toplam);
			


	}
}


