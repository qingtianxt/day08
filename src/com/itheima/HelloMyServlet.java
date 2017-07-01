package com.itheima;

public class HelloMyServlet {
	public void add(){
		System.out.println("空参的add方法");
	}
	public void add(int i,int j){
		System.out.println(i+j);
		System.out.println("有参数无返回值的add方法");
	}
	public int add(int i){
		System.out.println("有参，有返回值的add方法");
		return i+10;
	}
}
