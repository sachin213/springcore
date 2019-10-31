package com.concretepage;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @Component
// @Scope("prototype")
public class Book // implements InitializingBean, DisposableBean
{
	public Book()
	{
		super();
		System.out.println("book without parameter ->");
	}

	private String bookName;

	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}

	public Book(String bookName)
	{
		System.out.println("##############################################################cbook with parameter ->" + bookName);
		this.bookName = bookName;
	}

	// public void beanAnnotedInitMethod()
	// {
	// System.out.println("##############################################################called beanAnnotedInitMethod");
	// }

	@PostConstruct
	public void springPostConstruct()
	{
		System.out.println("##############################################################called springPostConstruct Book");
	}

	public String getBookName()
	{
		return bookName;
	}

	@PreDestroy
	public void springPreDestroy()
	{
		System.out.println("##############################################################called springPreDestroy Book");
	}

	// @Override
	// public void destroy() throws Exception
	// {
	// System.out.println("##############################################################disposable bean called");
	//
	// }
	//
	// @Override
	// public void afterPropertiesSet() throws Exception
	// {
	// System.out.println("##############################################################intializing bean called");
	//
	// }
}
