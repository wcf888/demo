package com.example.demo.dao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
	private String name;
	@SerializedName(value = "gender",alternate = "sex")
	private String sex;
	private transient int age;
	public User(String string) {
		// TODO Auto-generated constructor stub
		this.name=string;
	}
	public User(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
		this.name=string;
		this.sex=string2;
		this.age=i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		User usrUser=(User)obj;
		return getName()==usrUser.getName();
	}
	
}
