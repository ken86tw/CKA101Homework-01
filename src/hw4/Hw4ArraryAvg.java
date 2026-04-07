package hw4;
public class Hw4ArraryAvg {
	
	public static void main(String[] args) {
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int x [] ={29, 100, 39, 41, 50, 8, 66, 77, 95, 15};	//輸入陣列
		double sum=0,count=0,avg=0;							//宣告變數double是為了防止平均有小數點
		for(int i=0;i<x.length;i++) {						//看陣列長度
			sum+=x[i];										//加總
			count++;										//計算總共幾個數(也可以直接用x.length就不用多一個變數佔記憶體空間)
		}
		avg=sum/count;										//算加總/個數=平均
		System.out.println(avg);							//輸出
		for(int j=0;j<x.length;j++) {						//看陣列長度
			if(x[j]>avg){									//找大於平均的數
				System.out.println(x[j]);					//輸出
			}
		}
	}
}
