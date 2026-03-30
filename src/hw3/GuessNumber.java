package hw3;
import java.util.Scanner;

public class GuessNumber {
//	請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//	對則顯示正確訊息
	public static void main(String[] args) {
		int i=(int)(Math.random()*10);
		//System.out.println(i);
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請開始猜數字:");
		int data= sc.nextInt();
		if(data==i) {
			System.out.println("猜對了，遊戲結束!");
			break;
		}
		else
			System.out.println("猜錯了，請繼續猜:");
		}
	}
}
