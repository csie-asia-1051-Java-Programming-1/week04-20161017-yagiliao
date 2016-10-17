package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021039 廖野吉
 */
import java.util.Scanner;
public class ex03_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int c=1;
		for(int time=1;time<=n;time++){
			for(int b=1;b<=c;b++){
			System.out.print("*");
			}
			c++;
			System.out.println();
		}
	}

}
