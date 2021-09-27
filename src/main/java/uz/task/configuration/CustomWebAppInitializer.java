package uz.task.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class CustomWebAppInitializer implements WebApplicationInitializer {

    private static final String TMP_FOLDER = "/tmp";
    private static final Integer MAX_UPLOAD_FILE = 1024;

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic appServlet = servletContext.addServlet("mvc", new DispatcherServlet(
                new GenericWebApplicationContext()));

        appServlet.setLoadOnStartup(1);

        MultipartConfigElement element = new MultipartConfigElement(TMP_FOLDER, MAX_UPLOAD_FILE,
                MAX_UPLOAD_FILE * 2, MAX_UPLOAD_FILE / 2);

        appServlet.setMultipartConfig(element);
    }
}
