package hw2;

public class H2 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int sum=1;				//設定變數sum儲存結果
		for(int i=1;i<=10;i++) 	//for迴圈
			sum=sum*i;			//連乘
		System.out.println(sum);//輸出結果
	}
}