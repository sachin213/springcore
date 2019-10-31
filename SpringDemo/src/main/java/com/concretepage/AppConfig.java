package com.concretepage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
// @ComponentScan
public class AppConfig
{

	@Bean(name = "BookSingleton") // , initMethod = "beanAnnotedInitMethod")
	// @Scope("prototype")
	// @DependsOn({"Book1Singleton"})
	public Book book()
	{
		return new Book();
	}

	// @Bean(name = "BookSingleton_copy")
	// @Scope("singleton")
	// public Book book_copy()
	// {
	// return new Book("book_copy ramayana");
	// return new Book();
	// }

	// @Qualifier("BookPrototype")
	// @Bean(name = "BookPrototype")
	// @Scope("prototype")
	// public Book book2(String param)
	// {
	// return new Book(param);
	// }

	@Bean(name = "Book1Singleton")
	@DependsOn({"BookSingleton"})
	public Book1 book1()
	{
		return new Book1();
	}

	@Bean // (name = "DemoBeanPostProcessor")
	public DemoBeanPostProcessor demoBeanPostProcessor()
	{
		return new DemoBeanPostProcessor();
	}

	@Bean // (name = "DemoBeanPostProcessor2")
	public DemoBeanPostProcessor2 demoBeanPostProcessor2()
	{
		return new DemoBeanPostProcessor2();
	}

	@Bean
	public DemoBeanFactoryPostProcessor demoBeanFactoryPostProcessor()
	{
		return new DemoBeanFactoryPostProcessor();
	}

	@Bean
	public DemoBeanFactoryPostProcessor2 demoBeanFactoryPostProcessor2()
	{
		return new DemoBeanFactoryPostProcessor2();
	}
}
