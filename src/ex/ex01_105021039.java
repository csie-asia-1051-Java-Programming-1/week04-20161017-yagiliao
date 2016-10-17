package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021039 廖野吉
 */
import java.util.Scanner;
public class ex01_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a=0,tal=0,mean,time=0;
		while(a!=-1){
			a = scn.nextInt();
			tal=tal+a;
			time+=1;
		}
		System.out.println("總和:"+(tal+1));
		System.out.println("平均::"+(float)(tal+1)/(time-1));
	}
}
