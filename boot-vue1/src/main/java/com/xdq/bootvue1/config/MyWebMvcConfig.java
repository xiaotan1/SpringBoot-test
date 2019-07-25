
package com.xdq.bootvue1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {
    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.
                addResourceHandler("/static/**")
                . addResourceLocations ("classpath:/static/");
    }*/

    /**
     * 解决跨域问题
     * @param registry
     */
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/book/**")
                .allowedHeaders("*")
                .allowedMethods("*")
                .maxAge(1800)
                .allowedOrigins("http://localhost:8080");
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Myinterceptorl()).addPathPatterns("/**")
                .excludePathPatterns("/hello");//只对/hello    /表示所有的
//                .excludePathPatterns("/");
    }

    /**
     * 方法提供直接从浏览器请求的地址，映射到对应的页面
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/xdq").setViewName("books");
    }
}
