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
		//解析xml
				//创建document对象
				Document doc = new SAXReader().read("E:\\workek\\day08\\xml\\web.xml");
				
				//通过xpath解析获取servlet-class 和url-pattern的标签体
				Element servletClass=(Element) doc.selectSingleNode("//servlet-class");
				Element urlPattern=(Element) doc.selectSingleNode("//url-pattern");

				
				String classText=servletClass.getText();
				String urlTest=urlPattern.getText();
				//定义一个map
				Map<String,String> map=new HashMap<>();
				
				//往map中放入一个值，key:/hello value:com.itheima.HelloServlet
				map.put(urlTest,classText );
				
				//通过key 获取value
				String value=map.get("/hello");
				
				//通过全限定名 创建一个实例
				Class clazz = Class.forName(value);
				HelloMyServlet a=(HelloMyServlet)clazz.newInstance();
				
				//调用空参的add方法
				Method method = clazz.getMethod("add");
				method.invoke(a);
	}
	@Test
	public void f1() throws Exception{
		//定义一个map
		Map<String,String> map=new HashMap<>();
		
		//往map中放入一个值，key:/hello value:com.itheima.HelloServlet
		map.put("/hello", "com.itheima.HelloMyServlet");
		
		//通过key 获取value
		String value=map.get("/hello");
		
		//通过全限定名 创建一个实例
		Class clazz = Class.forName(value);
		HelloMyServlet a=(HelloMyServlet)clazz.newInstance();
		
		//调用空参的add方法
		Method method = clazz.getMethod("add");
		method.invoke(a);
	}
	@Test
	public void f2() throws Exception{
		
		//解析xml
		//创建document对象
		Document doc = new SAXReader().read("E:\\workek\\day08\\xml\\web.xml");
		
		//通过xpath解析获取servlet-class 和url-pattern的标签体
		Element servletClass=(Element) doc.selectSingleNode("//servlet-class");
		Element urlPattern=(Element) doc.selectSingleNode("//url-pattern");

		
		String classText=servletClass.getText();
		String urlTest=urlPattern.getText();
		//定义一个map
		Map<String,String> map=new HashMap<>();
		
		//往map中放入一个值，key:/hello value:com.itheima.HelloServlet
		map.put(urlTest,classText );
		
		//通过key 获取value
		String value=map.get("/hello");
		
		//通过全限定名 创建一个实例
		Class clazz = Class.forName(value);
		HelloMyServlet a=(HelloMyServlet)clazz.newInstance();
		
		//调用空参的add方法
		Method method = clazz.getMethod("add");
		method.invoke(a);
	}
}
