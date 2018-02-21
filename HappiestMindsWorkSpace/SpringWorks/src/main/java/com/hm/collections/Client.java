package com.hm.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		
		MyCollection coll = context.getBean("myCollection", MyCollection.class);
		
		System.out.println(coll.getQuestionBank().getQuesion());
		System.out.println(coll.getQuestionBank().getOptions());
		
		System.out.println(coll.getAddressSet().getAddressSet());

		Map<String, Long> map = coll.getAccountMap().getAccountMap();

		Iterator itr = map.entrySet().iterator();
		System.out.println("---------------Map----------------");
		while(itr.hasNext()){
			Map.Entry  temp = (Entry) itr.next(); 
			System.out.println("key "+ temp.getKey() );
			System.out.println("Value " + temp.getValue());
			
		}

	}
}