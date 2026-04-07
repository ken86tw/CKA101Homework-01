package hw4;
public class Hw4ReverseString {
	
	public static void main(String[] args) {
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
		String s = "Hello World";									//設定字串
		char[] reverse = s.toCharArray();							//轉成字元
		
		//方法一
		String result = new StringBuilder(s).reverse().toString();	//內建反轉函式
		System.out.print(result);									//輸出
		
		//方法二
//		for (int i = reverse.length-1; i >= 0; i--) 				//找字串長度
//	    System.out.print(reverse[i]);								//從最後面開始輸出

		//方法三
//		for(int j = reverse.length;j>0;j--)							//找字串長度
//		System.out.print(s.charAt(j-1));							//從最後面開始輸出
		
	}
}
