import java.util.Scanner;
import java.util.Random;

public class zadd{
  public static void main(String[] args){
	int N=0;
	int MIN=0;
	int MAX=0;
	int count=0;
	int lp=0;
 	Scanner odczyt = new Scanner(System.in);
	System.out.print("Podaj N");	
	N = odczyt.nextInt();

	System.out.print("Podaj MIN");
	MIN = odczyt.nextInt();

	System.out.print("Podaj MAX");	
	MAX = odczyt.nextInt();

	Random generator = new Random();

	for(int i=0; i<N; i++) {
  		lp = generator.nextInt(MAX*10)+MIN;
		if(lp<MAX && lp>MIN)
			{
			  count+=1;
			}
	}
    System.out.print("Ilosc liczb z przedzia³u:" + count);
  }
}