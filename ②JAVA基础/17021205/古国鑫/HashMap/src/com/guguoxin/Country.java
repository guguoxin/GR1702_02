package com.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年12月5日 上午9:03:09 
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
		return "Country [国家名：" + name + ", 人口：=" + population + "]";
	}
	
}
