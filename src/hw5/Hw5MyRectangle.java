package hw5;
public class Hw5MyRectangle {
//	請設計一個類別MyRectangle：
//	(1) 有兩個double型態的屬性為width, depth
//	(2) 有三個方法：
//	void setWidth(double width): 
//	void setDepth(double depth): 
//	double getArea():
//	(3) 有兩個建構子：
//	public MyRectangle(): 
//	public MyRectangle(double width, double depth):
		private double width,depth;
		public void setWidth(double width) {	//將收到的引數指定給width屬性
			this.width = width;
		}
		public void setDepth(double depth) {	//將收到的引數指定給depth屬性
			this.depth = depth;
		}
		public double getArea() {				//能計算該長方形的面積
			return width*depth;
		}
		
		public Hw5MyRectangle() {				//無參數建構子
			
		}
		
		public Hw5MyRectangle(double width, double depth) {	//兩個參數的建構子
			this.width = width;					//將參數width指定給物件的width屬性
			this.depth = depth;					//將參數depth指定給物件的depth屬性
		}
}
