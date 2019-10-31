package com.concretepage;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @Component
public class Book1
{
	// autowired by name because bytype it's giving error becase in Appconfig is 2 bean present with same type for Book bean

	// @Autowired
	// @Qualifier(value = "BookSingleton")
	private Book book;

	public Book1(Book book)
	{
		super();
		this.book = book;
	}

	// autowired by constructor
	// @Autowired
	public void setBook(Book book)
	{
		this.book = book;
	}

	private String book1Name;

	public Book getBook()
	{
		return book;
	}

	public String getBook1Name()
	{
		return book1Name;
	}

	public Book1()
	{
		super();
	}

	public Book1(String book1Name)
	{
		super();
		this.book1Name = book1Name;
	}

	public Book1(String book1Name, String book2Name)
	{
		super();
		this.book1Name = book1Name;
	}

	public void setBook1Name(String book1Name)
	{
		this.book1Name = book1Name;
	}

	@PostConstruct
	public int postConstructM()
	{
		// System.out.println("##############################################################123" + book.getBookName());
		System.out.println("##############################################################return 0 from postConstructM Book1");
		return 0;
	}

	@PreDestroy
	public int preDestroyM()
	{
		System.out.println("##############################################################return 1 from preDestroyM Book1");
		return 1;
	}
}
