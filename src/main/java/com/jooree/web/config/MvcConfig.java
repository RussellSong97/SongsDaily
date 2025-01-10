package com.jooree.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*registry.addResourceHandler(
                        "/js/**"
                        ,"/css/**"
                        ,"/images/**"
                        ,"/fonts/**"
                )
                .addResourceLocations(
                        "classpath:/static/js/"
                        ,"classpath:/static/css/"
                        ,"file:/D:/01.work/01.code/intellij/workspace/portfolio/src/main/resources/static/images/"
                        ,"classpath:/static/fonts/"
                );
        registry.addResourceHandler("resources/**")
                .addResourceLocations("classpath:/static/")
                .setCachePeriod(60 * 60 * 24 * 365);

        registry.addResourceHandler("resources/css/**")
                .addResourceLocations("classpath:/static/")
                .setCachePeriod(60 * 60 * 24 * 365);
                */

        registry.addResourceHandler("/favicon.ico")
                .addResourceLocations("classpath:/static/favicon.ico");

        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/static/js/")
                .setCacheControl(CacheControl.noCache().cachePrivate());

        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/static/css/")
                .setCacheControl(CacheControl.noCache().cachePrivate());

        registry.addResourceHandler("/images/**")
                .addResourceLocations("file:/D:/Code/intellij/workspace/jooree/src/main/resources/static/images/");
    }
}
