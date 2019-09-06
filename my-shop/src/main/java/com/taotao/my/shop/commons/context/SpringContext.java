package com.taotao.my.shop.commons.context;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther 姜志涛
 * @Date 2019/9/4 0004
 * @Time 下午 18:48
 */
public final class SpringContext implements ApplicationContextAware, DisposableBean {

    private static final Logger logger = LoggerFactory.getLogger(SpringContext.class);

    private static ApplicationContext applicationContext;

    public static <T> T getBean(String beanId){
        assertContextInjected();
        return (T) applicationContext.getBean(beanId);
    }

    public static <T> T getBean(Class<T> clazz){
        assertContextInjected();
        return applicationContext.getBean(clazz);
    }

    public void destroy() throws Exception {
        logger.debug("清空 ApplicationContext");
        applicationContext = null;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContext.applicationContext = applicationContext;
    }

    private static void assertContextInjected(){
        Validate.validState(applicationContext==null,"你还没在 spring-context.xml 中配置SpringContext对象");
    }
}
