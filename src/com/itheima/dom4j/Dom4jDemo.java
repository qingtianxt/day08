package com.itheima.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jDemo {

	public static void main(String[] args) throws Exception {
		//�������Ķ���
		SAXReader reader = new SAXReader();
		
		//��ȡdom��
		Document doc = reader.read("E:\\workek\\day08\\xml\\web.xml");
		
		//��ȡ���ڵ�
		Element root = doc.getRootElement();
		
		//��ȡ�����ڵ�
		List <Element> list = root.elements();
		
		//��������
		for (Element ele : list) {
			//��ȡservlet-name�ı�ǩ��
			String text=ele.elementText("servlet-name");
			//System.out.println(text);
			String text2 = ele.elementText("url-pattern");
			//System.out.println(text2);
			
		//��ȡroot��version����ֵ
			String value = root.attributeValue("version");
			System.out.println(value);
		}
	}

}
