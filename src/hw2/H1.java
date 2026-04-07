package hw2;

public class H1 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum=0;					//設定變數sum儲存結果
		for(int i=1;i<=1000;i++)	//迴圈
			if(i%2==0) 				//判斷偶數
				sum=sum+i;			//偶數和
		System.out.println(sum);	//輸出結果
	}
}
