package com.itheima.example1;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import com.itheima.HelloMyServlet;

public class Demo {
	
	public static void main(String args[]) throws Exception{
		//����xml
				//����document����
				Document doc = new SAXReader().read("E:\\workek\\day08\\xml\\web.xml");
				
				//ͨ��xpath������ȡservlet-class ��url-pattern�ı�ǩ��
				Element servletClass=(Element) doc.selectSingleNode("//servlet-class");
				Element urlPattern=(Element) doc.selectSingleNode("//url-pattern");

				
				String classText=servletClass.getText();
				String urlTest=urlPattern.getText();
				//����һ��map
				Map<String,String> map=new HashMap<>();
				
				//��map�з���һ��ֵ��key:/hello value:com.itheima.HelloServlet
				map.put(urlTest,classText );
				
				//ͨ��key ��ȡvalue
				String value=map.get("/hello");
				
				//ͨ��ȫ�޶��� ����һ��ʵ��
				Class clazz = Class.forName(value);
				HelloMyServlet a=(HelloMyServlet)clazz.newInstance();
				
				//���ÿղε�add����
				Method method = clazz.getMethod("add");
				method.invoke(a);
	}
	@Test
	public void f1() throws Exception{
		//����һ��map
		Map<String,String> map=new HashMap<>();
		
		//��map�з���һ��ֵ��key:/hello value:com.itheima.HelloServlet
		map.put("/hello", "com.itheima.HelloMyServlet");
		
		//ͨ��key ��ȡvalue
		String value=map.get("/hello");
		
		//ͨ��ȫ�޶��� ����һ��ʵ��
		Class clazz = Class.forName(value);
		HelloMyServlet a=(HelloMyServlet)clazz.newInstance();
		
		//���ÿղε�add����
		Method method = clazz.getMethod("add");
		method.invoke(a);
	}
	@Test
	public void f2() throws Exception{
		
		//����xml
		//����document����
		Document doc = new SAXReader().read("E:\\workek\\day08\\xml\\web.xml");
		
		//ͨ��xpath������ȡservlet-class ��url-pattern�ı�ǩ��
		Element servletClass=(Element) doc.selectSingleNode("//servlet-class");
		Element urlPattern=(Element) doc.selectSingleNode("//url-pattern");

		
		String classText=servletClass.getText();
		String urlTest=urlPattern.getText();
		//����һ��map
		Map<String,String> map=new HashMap<>();
		
		//��map�з���һ��ֵ��key:/hello value:com.itheima.HelloServlet
		map.put(urlTest,classText );
		
		//ͨ��key ��ȡvalue
		String value=map.get("/hello");
		
		//ͨ��ȫ�޶��� ����һ��ʵ��
		Class clazz = Class.forName(value);
		HelloMyServlet a=(HelloMyServlet)clazz.newInstance();
		
		//���ÿղε�add����
		Method method = clazz.getMethod("add");
		method.invoke(a);
	}
}
