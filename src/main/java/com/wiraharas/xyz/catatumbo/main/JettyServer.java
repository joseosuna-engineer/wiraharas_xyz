package com.wiraharas.xyz.catatumbo.main;

import com.wiraharas.xyz.catatumbo.conf.SpringConfig;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class JettyServer {

    public static void main(String[] args) throws Exception {

        int port = 8080;

        // TOMAR PUERTO DESDE LA LINEA DE COMANDOS
        try {
            for (String arg : args) {
                if (arg.contains("port")) {
                    String portStr = arg;
                    String[] parts = portStr.split("=");
                    String portNumberStr = parts[1];
                    port = Math.abs(Integer.parseInt(portNumberStr));
                    break;
                }

            }
        } catch (Exception e) {

        }

        // SPRING FRAMEWORK
        final AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();

        applicationContext.register(SpringConfig.class);

        // JETTY SERVER
        final ServletHolder servletHolder = new ServletHolder(new DispatcherServlet(applicationContext));
        final ServletContextHandler context = new ServletContextHandler();

        context.setErrorHandler(null); // use Spring exception handler(s)
        context.setContextPath("/");
        context.addServlet(servletHolder, "/");

        Server httpServer = new Server(port);

        httpServer.setHandler(context);

        httpServer.start();
        httpServer.join();

    }

}
