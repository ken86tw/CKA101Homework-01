package hw3;
import java.util.Scanner;

public class Lotto2 {
//	阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//	厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//	的號碼與總數
//	進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複
	public static void main(String[] args) {
		int count=0;						//設定變數count儲存累計的數量
		int result[]=new int[49];			//設定陣列
		//System.out.println(i);
		Scanner sc = new Scanner(System.in);//阿文輸入討厭的數字
		System.out.println("阿文...請輸入你討厭哪個數字？(請輸入1~9)");
		int data= sc.nextInt();				//把輸入的數字儲存起來
		for(int i=1;i<=49;i++) {			//迴圈
			if((i/10!=data)&&(i%10!=data)) 	//判斷數字不包含討厭的數字
				result[i-1]=1;				//把該陣列內容設為1表示這格有值
			else							//判斷數字不包含討厭的數字
				result[i-1]=0;				//把該陣列內容設為0表示這格沒有值
		}
		System.out.println("隨機六組號碼是:");
		while(true) {						//迴圈
			int a=(int)(Math.random()*49+1);//設定變數a用來存儲抽取號碼
			if (result[a-1]==1) {			//判斷數字a不是討厭的數字
				result[a-1]=0;				//把這格設為0表示抽過
				System.out.print(a);		//輸出抽到的數字
				if(++count==6)				//計數+1,判斷抽到六個數字了沒
					break;					//已抽到的話停止迴圈
				System.out.print(" ");
			}
		}
	}
}