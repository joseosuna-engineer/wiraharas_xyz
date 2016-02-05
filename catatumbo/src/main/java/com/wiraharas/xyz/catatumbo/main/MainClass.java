/*
 * Copyright 2016 Wiraharas AG.
 */
package com.wiraharas.xyz.catatumbo.main;

import com.wiraharas.xyz.catatumbo.servlet.MyServlet;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.Configuration;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.WebXmlConfiguration;

/**
 *
 * @author Jose Osuna (Trebol-IT)
 */
public class MainClass {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        Server httpServer = new Server(8090);
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/");
        webAppContext.setBaseResource(Resource.newClassPathResource("web"));
        webAppContext.addServlet(MyServlet.class.getName(), "/my-servlet");
        webAppContext.setConfigurations(new Configuration[]{new WebXmlConfiguration()});
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[]{webAppContext, new DefaultHandler()});
        httpServer.setHandler(handlers);
        httpServer.start();

    }

}
