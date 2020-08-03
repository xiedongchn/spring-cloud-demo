package com.xd.springclouddemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 测试Listener、Filter、servlet的执行顺序
 * 参考:https://blog.csdn.net/gebitan505/article/details/70808730
 * HttpSessionListener(用来监控session的创建，销毁等)
 * ServletRequestListener(用于监控servlet上下文request)
 * ServletRequestAttributeListener(用于监控request中的attribute的操作)
 */
public class TestListener implements HttpSessionListener, ServletRequestListener, ServletRequestAttributeListener {
    private static final Logger logger = LoggerFactory.getLogger(TestListener.class);

    //sessionListener start!
    public void sessionCreated(HttpSessionEvent arg0) {
        logger.info(".......TestListener sessionCreated().......");
    }

    public void sessionDestroyed(HttpSessionEvent arg0) {
        logger.info(".......TestListener sessionDestroyed().......");
    }
    //sessionListener end!

    //requestListener start!
    public void requestInitialized(ServletRequestEvent arg0) {
        logger.info("......TestListener requestInitialized()......");
    }

    public void requestDestroyed(ServletRequestEvent arg0) {
        logger.info("......TestListener requestDestroyed()......");
    }
    //requestListener end!

    //attributeListener start!
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        logger.info("......TestListener attributeAdded()......");
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        logger.info("......TestListener attributeRemoved()......");
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        logger.info("......TestListener attributeReplaced()......");
    }
    //attributeListener end!
}
