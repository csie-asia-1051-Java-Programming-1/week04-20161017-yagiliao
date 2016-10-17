package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021039 廖野吉
 */
import java.util.Scanner;
public class ex04_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		char a=scn.next().charAt(0);
		int c=n;
		for(int time=1;time<=n;time++){
			for(int b=c;b>=1;b--){
				System.out.print(a);
			}
			c--;
			System.out.println();
		}
	}

}
