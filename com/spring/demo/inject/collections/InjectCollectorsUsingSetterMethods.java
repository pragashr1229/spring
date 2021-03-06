package com.spring.demo.inject.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectCollectorsUsingSetterMethods {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig2.class);
		CollectionsBean2 collectionsBean = context.getBean(CollectionsBean2.class);
		collectionsBean.printNameMap();
	}
}
