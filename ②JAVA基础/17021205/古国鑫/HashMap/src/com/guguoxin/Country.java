package com.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��12��5�� ����9:03:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Country {
	
	String name;
	long population;
	
	
	public Country(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}


	@Override
	public String toString() {
		return "Country [��������" + name + ", �˿ڣ�=" + population + "]";
	}
	
}
