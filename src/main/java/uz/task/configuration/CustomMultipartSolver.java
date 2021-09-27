package uz.task.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

public class CustomMultipartSolver {

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartSolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(1000);
        return multipartResolver;
    }
}
