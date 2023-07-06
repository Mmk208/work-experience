package Tag5;
import java.util.*;

public class Aufgabe1 {

	public static void main(String[] args) {
		//eingabe des wortes
		Scanner sc = new Scanner(System.in);

		do{	
			System.out.println("Gib den Namen ein oder exit");
			String wort = sc.nextLine();

			if(wort.equals("exit")) {
				break;				
			}
			System.out.println("Length = " + wort.length());
			char[] chr = wort.toCharArray();

			for(int i = 0; i < chr.length; i++ ){
				int counter = 0;


				for(int j = 0; j < chr.length; j++){
					if(chr[i] < chr[j]) {
						char temp = chr[j];
						chr[j] = chr[i];
						chr[i] = temp;
						
					}
					
					if(chr[i] == chr[j]) {
						counter = counter + 1;

					}
					
				}

				boolean alreadySeen = false;
				if (i > 0)
				{
					for(int j = i - 1; j >= 0; j--){
						if (chr[i] == chr[j]) {
							alreadySeen = true;
							break;
						}
					}
				}
				if (!alreadySeen)
				{
					System.out.println(chr[i] + " = " + counter);

				}

			}
			System.out.println(chr);
			



		}while(true);
		

	}	
}
