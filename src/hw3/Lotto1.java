package hw3;
import java.util.Scanner;

public class Lotto1 {
//	阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//	厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//	的號碼與總數
	public static void main(String[] args) {
		int count=0;						//設定一個變數儲存累計的數量
		//System.out.println(i);
		Scanner sc = new Scanner(System.in);//阿文輸入討厭的數字
		System.out.println("阿文...請輸入你討厭哪個數字？(請輸入1~9)");
		int data= sc.nextInt();				//把輸入的數字儲存起來
		for(int i=1;i<=49;i++) {			//迴圈
			if((i/10!=data)&&(i%10!=data)) {//判斷數字不包含討厭的數字
				System.out.print(i+"\t");	//輸出不討厭的數字
				count++;					//計數
				if(count%6==0)				//每輸出6個
					System.out.println();	//換行
			}
		}
		System.out.println("總共有"+count+"個數字可選");//輸出統計數字
	}
}