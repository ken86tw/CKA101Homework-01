package hw2;

public class H6 {
	public static void main(String[] args) {
		/*請設計一隻Java程式，輸出結果為以下：
		1 2 3 4 5 6 7 8 9 10
		1 2 3 4 5 6 7 8 9
		1 2 3 4 5 6 7 8
		1 2 3 4 5 6 7
		1 2 3 4 5 6 
		1 2 3 4 5
		1 2 3 4 
		1 2 3 
		1 2 
		1
		*/
		for(int i=0;i<10;i++) {			//迴圈層數
			int k=1;					//輸出的數字(放在這每次迴圈可以重置)
			for(int j=10;j-i>0;j--) {	//迴圈次數
				System.out.print(k+" ");//輸出數字
				k++;					//數字+1
			}
			System.out.println();		//換行
		}
	}
}
