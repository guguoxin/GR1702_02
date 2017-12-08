package com.guguoxin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年12月5日 上午8:31:39 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		
		Country china = new Country("china", 15);
		Country india = new Country("india", 14);
		Country japan = new Country("japan", 2);
		
		hashMap.put(china, "Beijing");
		hashMap.put(india, "Delhi");
		hashMap.put(japan, "Tokyo");
		
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			entry.getValue();
			Country key = entry.getKey();
			System.out.println(key.toString());
			
		}
	}

}
