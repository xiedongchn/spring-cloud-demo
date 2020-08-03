package com.xd.springclouddemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 *
 */
public class TestFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(TestFilter.class);

    public void destroy() {
        logger.info("..............execute TestFilter destory()..............");
    }

    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
        logger.info("..............execute TestFilter doFilter()..............");
        arg2.doFilter(arg0, arg1);
    }

    public void init(FilterConfig arg0) throws ServletException {
        logger.info("..............execute TestFilter  init()..............");
    }
}
