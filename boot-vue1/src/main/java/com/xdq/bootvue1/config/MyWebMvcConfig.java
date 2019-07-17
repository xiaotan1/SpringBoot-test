
package com.xdq.bootvue1.config;

        import org.springframework.context.annotation.Configuration;
        import org.springframework.web.servlet.config.annotation.CorsRegistry;
        import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
        import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {
    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.
                addResourceHandler("/static/**")
                . addResourceLocations ("classpath:/static/");
    }*/

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/book/**")
                .allowedHeaders("*")
                .allowedMethods("*")
                .maxAge(1800)
                .allowedOrigins("http://localhost:BOBl");
    }
}
