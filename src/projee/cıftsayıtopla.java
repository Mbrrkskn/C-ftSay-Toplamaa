package projee;
import java.util.Scanner;
public class c�ftsay�topla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scan = new Scanner(System.in);
				int toplam = 0;
				System.out.println("Ka��nc� say�ya kadar olan �ift say�lar�n toplam�n� istiyorsunuz: ");
				int deger = scan.nextInt();
				int i = 0;
				while (i < deger) {
					if (i % 2 == 0) {
						toplam += i;
					}
					i++;
				}
				System.out.printf("%d e kadar olan �ift say�lar toplam�: %d", deger, toplam);
			


	}
}


