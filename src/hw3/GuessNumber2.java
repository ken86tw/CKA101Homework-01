package hw3;
import java.util.Scanner;

/*//Hello World test*/
public class GuessNumber2 {
	//	進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
	public static void main(String[] args) {
		int i=(int)(Math.random()*101);
		//System.out.println(i);
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請開始猜數字:");
			int data= sc.nextInt();
			if(data==i) {
				System.out.println("猜對了，遊戲結束!");
				break;
			}
			else {
				if(data>i)
					System.out.println("大於正確答案，請繼續猜:");
				else
					System.out.println("小於正確答案，請繼續猜:");
			}
		}
	}
}
