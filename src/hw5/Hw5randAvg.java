package hw5;
public class Hw5randAvg {
//	請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中
//	取平均值並印出這10個亂數與平均值
	public static void randAvg() {					//設計方法
		int sum=0;									//設定變數儲存值
		System.out.println("本次亂數結果: ");		
		for(int i=0;i<10;i++) {						//跑十次
			int random=(int)(Math.random()*101);	//亂數0~100
			System.out.print(random + " ");			//印出亂數
			sum+=random;							//亂數加總
		}
		System.out.println("\n"+ sum/10);			//換行後印出亂數平均值
	}
	public static void main(String[] args) {
		randAvg();									//呼叫方法
	}
}