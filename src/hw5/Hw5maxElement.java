package hw5;
import java.util.Arrays;
public class Hw5maxElement {
//	利用Overloading，設計兩個方法int maxElement(int x[][])與
//	double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳
	public static int maxElement (int x[][]) {			//方法一、int方法
		int max=0;										//設定變數存最大值
		for(int i=0;i<x.length;i++) {					//找二維陣列長度
			for(int j=0;j<x[i].length;j++) 				//找二維陣列個數
				if(max<x[i][j]) 						//比對陣列內容	
					max=x[i][j];						//若陣列內容比較大就放進儲存的變數
		}
		return max;										//回傳int變數
	}
	public static double maxElement (double x[][]) {	//方法二、double方法
		return Arrays.stream(x).flatMapToDouble(Arrays::stream).max().getAsDouble();
		//回傳double 用內建方法找二維陣列的最大值
		//轉stream.攤成一維陣列.找出最大值.轉回double 回傳
	}
	public static void main(String[] args) {
		int[][] iArray = {{1, 6, 3},{9, 5, 2}};					//設定int陣列
		double[][] dArray = {{1.2, 3.5, 2.2},{7.4, 2.1, 8.2}};	//設定double陣列
		
		Hw5maxElement h = new Hw5maxElement();					//建立類別物件h
		System.out.println(h.maxElement(iArray));				//印出丟入int陣列的方法
		System.out.println(h.maxElement(dArray));				//印出丟入double陣列的方法
	}
	
}
