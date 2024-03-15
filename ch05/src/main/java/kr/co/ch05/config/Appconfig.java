package kr.co.ch05.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"kr.co.ch05"})
public class Appconfig implements WebMvcConfigurer {

    public void configureViewResolvers(ViewResolverRegistry registry) {
        // ViewResolver 설정 - jsp 경로 위치 설정
        registry.jsp("/WEB-INF/views/", ".jsp");
    }


    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // ResourceHandler 설정 - 정적 리소스의 결오 위치 설정
        registry.addResourceHandler("/**").addResourceLocations("/resources/");
    }
}
