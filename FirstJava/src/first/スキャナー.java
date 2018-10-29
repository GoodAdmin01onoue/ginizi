package first;

import java.util.Scanner;

public class スキャナー {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		//aの値を偶数か奇数かを判定
        if(a%2==0) {
        //コンソールに出力
        	System.out.println("偶数です");
        }else
        	System.out.println("奇数です");
        }



	}


