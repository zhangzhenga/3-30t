/**   
 * Copyright © 2020 公司名. All rights reserved.
 * 
 * @Title: Person.java 
 * @Prject: zhangzheng-common3
 * @Package: com.zheng.util 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2020年3月30日 下午2:42:28 
 * @version: V1.0   
 */
package com.zheng.util;

/** 
 * @ClassName: Person 
 * @Description: TODO
 * @author: lenovo
 * @date: 2020年3月30日 下午2:42:28  
 */
public class Person {
	private String name;
	private int age;
	private String about;
	private String created;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public Person(String name, int age, String about, String created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about
				+ ", created=" + created + "]";
	}
	
}
