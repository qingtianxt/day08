package com.itheima;

public class HelloMyServlet {
	public void add(){
		System.out.println("�ղε�add����");
	}
	public void add(int i,int j){
		System.out.println(i+j);
		System.out.println("�в����޷���ֵ��add����");
	}
	public int add(int i){
		System.out.println("�вΣ��з���ֵ��add����");
		return i+10;
	}
}
