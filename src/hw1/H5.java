package hw1;

public class H5 {
	public static void main(String[] args) {
		//本利和公式FV=PV*(1+r)n次方,本利和=本金*(1+利率)總期數次方
		double money=1500000,rate=0.02,year=10,result;
		result=money*Math.pow((1+rate),year);
		System.out.println("本利和:"+(int)result);
	}
}
