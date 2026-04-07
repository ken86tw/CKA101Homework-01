package hw3;
import java.util.Scanner;

public class GuessNumber {
//	請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//	對則顯示正確訊息
	public static void main(String[] args) {
		int i=(int)(Math.random()*10);			//產生0~9的亂數
		//System.out.println(i);
		while(true) {							//無限迴圈
		System.out.println("請開始猜數字:");		//輸出提示叫使用者輸入資料
		Scanner sc = new Scanner(System.in);	//使用者輸入猜的數字
		int data= sc.nextInt();					//把輸入的數字儲存起來
		if(data==i) {							//判斷是否一致
			System.out.println("猜對了，遊戲結束!");	//一致則遊戲結束
			break;									//停止迴圈
			}
		else										//其他狀況
			System.out.println("猜錯了，請繼續猜:");	//不一致則遊戲繼續
		}
	}
}