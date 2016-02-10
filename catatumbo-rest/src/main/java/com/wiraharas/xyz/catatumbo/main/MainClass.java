/*
 * Copyright 2016 Wiraharas AG.
 */
package com.wiraharas.xyz.catatumbo.main;

import com.wiraharas.xyz.catatumbo.conf.SpringConf;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author Jose Osuna (Trebol-IT)
 */
public class MainClass {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        final AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();

        applicationContext.register(SpringConf.class);

        final ServletHolder servletHolder = new ServletHolder(new DispatcherServlet(applicationContext));
        final ServletContextHandler context = new ServletContextHandler();

        context.setErrorHandler(null); // use Spring exception handler(s)
        context.setContextPath("/");
        context.addServlet(servletHolder, "/");

        Server httpServer = new Server(8090);

        httpServer.setHandler(context);

        httpServer.start();
        httpServer.join();

    }

}
