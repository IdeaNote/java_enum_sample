package java_practice1;

import java.util.HashMap;

public class HashMapSample {
	public static void  main(String[] args){
		/** HashMap<キーの型,オブジェクトの型> */
		// マップを作成する
		HashMap<String,String> map = new HashMap<>();{
			// データを登録する
			map.put("331-0001","田中");
			map.put("269-0002","佐藤");
			map.put("478-0003","金田");
			
			System.out.println(map.get("478-0003"));
		}
	}
}
