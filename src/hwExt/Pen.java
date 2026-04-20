package hwExt;

public abstract class Pen {
//	建立父類別Pen
//	(1) 兩個屬性：品牌(brand)、價格(price) (封裝設計) 
//	(2) 建構子設計：一個無參數與一個根據屬性而設計
//	(3) 定義Getter/Setter方法
//	(4) 宣告一個抽象方法write()
//	建立兩個子類別Pencil與InkBrush繼承Pen父類別
//	(1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//	(2) Pencil實際售價為定價8折，InkBrush為定價9折
//	(3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額
		private String brand;
		private double price;
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getBrand() {
			return brand;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getPrice() {
			return price;
		}
		public Pen() {
			
		}
		public Pen(String brand,double price) {
			this.brand=brand;
			this.price=price;
		}
		public abstract void write();
		
}
