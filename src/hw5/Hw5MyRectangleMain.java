package hw5;
public class Hw5MyRectangleMain {
//	(1) 使用public MyRectangle()建構子建立物件，
//	設定width, depth為10, 20，透過getArea()印出結果
//	(2) 使用public MyRectangle(double width, double depth)
//	建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
	public static void main(String[] args) {
		Hw5MyRectangle h = new Hw5MyRectangle();		//建立類別物件 h
		h.setWidth(10);									//呼叫方法 設定Width=10
		h.setDepth(20);									//呼叫方法 設定Depth=20
		System.out.println(h.getArea());				//呼叫h的getArea() 計算面積 印出
		Hw5MyRectangle w = new Hw5MyRectangle(10,20);	//建立類別物件 w 輸入值(10,20)給(Width,Depth)
		System.out.println(w.getArea());				//呼叫w的getArea() 計算面積 印出
	}
}
