package com.czxy.SpringbootConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/8/1
 */
@Configuration
public class ImgConfig implements WebMvcConfigurer {
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img").addResourceLocations("files:D:\\idea pros\\GitPros\\shop\\shop_web\\src\\main\\resources\\static\\img\\");
    }
}
