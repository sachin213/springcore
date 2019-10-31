package com.concretepage;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor implements BeanPostProcessor, Ordered
{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("##############################################################postProcessBeforeInitialization->" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("##############################################################postProcessAfterInitialization->" + beanName);
		return bean;
	}

	@Override
	public int getOrder()
	{
		// highest priority after 0
		return -1;
	}

}
