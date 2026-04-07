package hw1;

public class H6 {
	public static void main(String[] args) {
		
		System.out.println(5+5);
		//結果=10,兩個數值5相加
		
		System.out.println(5+'5');
		//結果=58,數值5加上字元'5'的Unicode碼轉換為53
		
		System.out.println(5+"5");
		//結果=55,因為有字串,所以執行上變成字串的串接
	}
}