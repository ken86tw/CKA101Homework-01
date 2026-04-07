package hw2;

public class H7 {
	public static void main(String[] args) {
		/*請設計一隻Java程式，輸出結果為以下：
A
BB
CCC
DDDD
EEEEE
FFFFFF
		*/
		for(int i=1;i<=6;i++) {			//迴圈層數
			for(int j=0;j<i;j++) {		//迴圈次數
				char tex=0x41;			//從A開始
				tex+=i-1;				//每次執行+1
				System.out.print(tex);	//輸出
			}
			System.out.println();		//換行
		}
	}
}
