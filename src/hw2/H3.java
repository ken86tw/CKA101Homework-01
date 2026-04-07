package hw2;

public class H3 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int sum=1, i=1;			//設定變數sum儲存結果,i為迴圈控制器
		while(i<=10) {			//while迴圈
			sum=sum*i;			//連乘
			i++;				//i=i+1
		}
		System.out.println(sum);//輸出結果
	}
}