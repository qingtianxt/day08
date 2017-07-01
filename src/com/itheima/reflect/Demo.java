package com.itheima.reflect;

import java.lang.reflect.Method;

import org.junit.Test;

import com.itheima.HelloMyServlet;

public class Demo {
	@Test
	public void f1(){
		HelloMyServlet a = new HelloMyServlet();
		a.add();
		a.add(10, 20);
	}
	@Test
	public void f2() throws Exception{
		Class clazz = Class.forName("com.itheima.HelloMyServlet");
		
		//ͨ���ֽ�����󴴽�һ��ʵ���������൱�ڵ��ÿղεĹ�������
		HelloMyServlet a= (HelloMyServlet) clazz.newInstance();
		a.add();
	}
	@Test
	//���ÿղε�add����
	public void f3() throws Exception{
		Class clazz = Class.forName("com.itheima.HelloMyServlet");
		
		//ͨ���ֽ�����󴴽�һ��ʵ���������൱�ڵ��ÿղεĹ�������
		HelloMyServlet a= (HelloMyServlet) clazz.newInstance();
		
		//��ȡ��������
		Method method = clazz.getMethod("add");
		
		//�÷�������ִ�� obj�������������ʵ�����൱��a��args�Ǹ÷���ִ��ʱ������Ҫ�Ĳ���a.add()
		method.invoke(a);//�൱��a.add()
	}
	@Test
	public void f4() throws Exception{
		//��ȡClass����
		Class clazz=HelloMyServlet.class;
		
		//ͨ��clazz���󴴽�һ��ʵ��
		HelloMyServlet a= (HelloMyServlet)clazz.newInstance();
		
		//��ȡ������������add����
		Method m = clazz.getMethod("add", int.class,int.class);
		
		//ִ�з���
		m.invoke(a, 10,40);//�൱��a.add(10,30);
	}
}
