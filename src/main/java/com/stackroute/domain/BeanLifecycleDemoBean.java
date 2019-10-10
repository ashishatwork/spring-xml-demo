package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean
{

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("after initialization");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("before destruction");
    }
    public void customInit()
    {
        System.out.println("Custom init method called");
    }

    public void customDestroy()
    {
        System.out.println("Custom Destroy method called");

    }
}
