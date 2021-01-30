package FacadePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
	private static int choice;
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		do {
			System.out.println("======== Mobile shop ========\n");
			System.out.println("1. Iphone\n");
			System.out.println("2. Samsung\n");
			System.out.println("3. Blackberry\n");
			System.out.println("4. Exit\n");
			System.out.println("Enter your choice: \n");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			
			ShopKeeper shopKeeper = new ShopKeeper();
			
			switch(choice) {
			case 1:
				shopKeeper.iphoneSale();
				break;
			case 2:
				shopKeeper.samsungSale();
				break;
			case 3:
				shopKeeper.blackberrySale();
				break;
			default:
				System.out.println("Nothing you purchased");
			}

		} while(choice != 4);
	}
}
