package mangotreefinder;

import java.util.Scanner;

public class MangoTreeFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		int count = 0;
		int treenumber = scanner.nextInt();
		if(treenumber > rows*columns-1 && treenumber <=rows*columns){
            count++;
        }
        for(int i=1;i<columns-1;i++)
        {
            if((i*rows)+1 == treenumber)
            {
                count++;
            }
        }
        if(count>=1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
	}

}
