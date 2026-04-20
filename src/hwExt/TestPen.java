package hwExt;

public class TestPen {
//	建立兩個子類別Pencil與InkBrush繼承Pen父類別
//	(1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//	(2) Pencil實際售價為定價8折，InkBrush為定價9折
//	(3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額
	public static void main(String[] args) {
		Pen p = new Pencil();
		p.setBrand("鉛筆");
		p.setPrice(10.0);
		Pen i = new InkBrush("毛筆",100.0);
		System.out.println("品牌:"+p.getBrand());
		System.out.println("價格:"+p.getPrice());
		p.write();
		System.out.println();
		System.out.println("品牌:"+i.getBrand());
		System.out.println("價格:"+i.getPrice());
		i.write();
	}
}
