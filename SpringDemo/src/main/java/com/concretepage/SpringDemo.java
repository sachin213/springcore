package com.concretepage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo
{
	public static void main(String[] args)
	{
		System.out.println("##############################################################");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();

		Book book = ctx.getBean(Book.class);
		book.setBookName("ramayana");
		System.out.println("##############################################################Book name:" + book.getBookName());

		Book1 book1 = ctx.getBean(Book1.class);
		book1.setBook1Name("bible");
		System.out.println("##############################################################Book1 name:" + book1.getBook1Name());
		ctx.close();
	}
}
