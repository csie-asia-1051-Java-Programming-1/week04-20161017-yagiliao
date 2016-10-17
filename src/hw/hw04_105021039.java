package hw;
import java.util.Scanner;
public class hw04_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		if(n==1){
			int a=scn.nextInt();
			int c=a;
			for(int time=1;time<=a;time++){
				for(int b=c-2;b>=1;b--){
					System.out.print("@");
					}
				c--;
				System.out.println();
				
				}
			}
		}
	}
