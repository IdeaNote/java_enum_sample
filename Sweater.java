package java_practice1;

public enum Sweater {
	LARGE("Lサイズ",1000),MEDIUM("Mサイズ",900),SMALL("Sサイズ",800);
	
	String size; //サイズ
	int    price; //値段
	
	/** 列挙のコンストラクタは列挙定数の初期化専用である */
	/** 列挙定数は静的定数であるため、プログラム実行開始前に作成されているので常に存在している */
	Sweater(String size,int price){
		this.size = size;
		this.price = price;
	}
	
	public String getSize(){return size;}
	public int getPrice(){return price;}
	public String toString(){return size+"/"+price;}
}
