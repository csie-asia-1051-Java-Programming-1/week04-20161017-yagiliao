package hw;
import java.util.Scanner;
public class hw03_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a=0,b=0,c=0,i=0;
		while(i!=999){
			 i=scn.nextInt();
			if(i>0 && i!=999){
				a=a+1;
			}else{
				if(i==0){
					b=b+1;
				}else{
					if(i<0){
						c=c+1;
					}
				}
			}System.out.println("正數有:"+a+"個"+ "\n" +"零有:"+b+"個"+ "\n" +"負數:"+c+"個");
		}
	}

}
