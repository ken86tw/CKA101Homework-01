package hw3;
import java.util.Scanner;

public class GuessNumber2 {
	//	進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
	public static void main(String[] args) {
		int i=(int)(Math.random()*101);				//產生0~100亂數
		//System.out.println(i);					
		while(true) {								//無限迴圈
			System.out.println("請開始猜數字:");		//輸出提示叫使用者輸入資料
			Scanner sc = new Scanner(System.in);	//使用者輸入猜的數字
			int data= sc.nextInt();					//把輸入的數字儲存起來
			if(data==i) {							//判斷是否一致
				System.out.println("猜對了，遊戲結束!");	//一致則遊戲結束
				break;									//停止迴圈
			}
			else {												//若不一致
				if(data>i)										//再判斷大於答案
					System.out.println("大於正確答案，請繼續猜:");	//告訴使用者
				else											//其他狀況(小於答案)
					System.out.println("小於正確答案，請繼續猜:");	//告訴使用者
			}
		}
	}
}
