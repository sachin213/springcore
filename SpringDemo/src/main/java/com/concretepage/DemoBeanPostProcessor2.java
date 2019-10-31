package com.concretepage;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor2 implements BeanPostProcessor, Ordered
{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("##############################################################postProcessBeforeInitialization__2->" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("##############################################################postProcessAfterInitialization__2" + beanName);
		return bean;
	}

	@Override
	public int getOrder()
	{
		// highest priority
		return -2;
	}

}
