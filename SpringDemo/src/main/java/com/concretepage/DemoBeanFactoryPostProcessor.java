package com.concretepage;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered
{
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException
	{
		System.out.println("##############################################################postProcessBeanFactory called" + beanFactory.toString());
	}

	@Override
	public int getOrder()
	{
		// highest priority
		return 0;
	}

}
