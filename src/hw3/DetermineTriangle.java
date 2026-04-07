package hw3;
import java.util.Arrays;
import java.util.Scanner;

public class DetermineTriangle {
//	請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形
//	進階功能：加入直角三角形的判斷
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//輸入三邊長
		boolean isTriangle = true;				//設定一個變數用來判斷是否三角形
		int[] data = new int[3];				//設定一個陣列用來放輸入的三邊長
		System.out.println("請輸入三角形邊長:");	//輸出提示叫使用者輸入資料
		for(int i=0;i<data.length;i++) 			//根據陣列大小看要輸入幾個邊長(其實可以直接寫3)
			data[i]= sc.nextInt();				//使用者輸入三邊長
		Arrays.sort(data);						//先把三邊長排序
//		for(int i = 0; i < data.length; i++) 	//輸出測試三邊長看看有沒有錯誤的情況
//			System.out.println(data[i]);
		//判斷三角形種類
		if (data[0] + data[1] <= data[2]) {		//判斷三角形
            System.out.println("不是三角形");		//告訴使用者不是三角形
            isTriangle = false;}				//在變數isTriangle記得這不是三角形
		else if(data[0]==data[1]&&data[1]==data[2]) 	//判斷正三角形
            System.out.println("正三角形");				//告訴使用者是正三角形
		else if(data[0]==data[1]||data[1]==data[2])		//判斷等腰三角形
            System.out.println("等腰三角形");				//告訴使用者是等腰三角形
		else											//其他狀況
            System.out.println("其它三角形");				//告訴使用者是其他三角形
		//直角三角形的判斷
		if(isTriangle==true)							//判斷是不是三角形
			if (data[2] * data[2] == data[0] * data[0] + data[1] * data[1])		//判斷直角三角形 
			    System.out.println("直角三角形");
			else if (data[2] * data[2] > data[0] * data[0] + data[1] * data[1])	//判斷鈍角三角形
			    System.out.println("鈍角三角形");
			else 																//判斷銳角三角形
			    System.out.println("銳角三角形");
	}
}
