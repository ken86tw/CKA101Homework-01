package hw2;

public class H5 {
	public static void main(String[] args) {
//		阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int count=0;					//設定變數用以計數
		for(int i=1;i<=49;i++) {		//迴圈
			if(i/10==4)					//判斷十位數有4
				continue;				//跳到下次迴圈
			if(i%10==4)					//判斷個位數有4
				continue;				//跳到下次迴圈
			System.out.print(i+" ");	//輸出數字
			count++;					//計數
		}
		System.out.print("\n總共"+count+"個");	//換行並輸出個數
	}
}
