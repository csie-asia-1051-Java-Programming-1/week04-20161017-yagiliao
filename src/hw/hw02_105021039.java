package hw;
import java.util.Scanner;
public class hw02_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int s=n-m;
		int sum1=1,sum2=1,sum3=1;
		for(int a=n;a>=1;a--){
			sum1=sum1*a;
		}
		for(int b=m;b>=1;b--){
			sum2=sum2*b;
		}
		for(int c=s;c>=1;c--){
			sum3=sum3*c;
		}
		System.out.print(sum1/(sum2*sum3));
	}

}
