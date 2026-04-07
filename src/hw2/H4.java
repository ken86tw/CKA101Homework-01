package hw2;

public class H4 {
	public static void main(String[] args) {
//		請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		int sum=1,i=2;				//設定變數sum為輸出值,變數i為遞增間隔
		while(sum<=100) {			//迴圈在100以內
			System.out.print(sum+" ");//輸出sum
			sum=sum+i*2-1;			//數列遞增
			i++;					//遞增間隔增加
		}
	}
}