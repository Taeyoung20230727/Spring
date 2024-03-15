package kr.co.ch02.config;


import kr.co.ch02.sub1.Greeting;
import kr.co.ch02.sub1.Hello;
import kr.co.ch02.sub1.Welcome;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@Configurable
@ComponentScan(basePackages = {"kr.co.ch02"})
public class Appconfig {

    @Bean
    public Hello hello(){
        return new Hello();
    }

    @Bean(name = "welcome")
    public Welcome welcome(){
        return new Welcome();
    }
    @Bean("greeting")
    public Greeting greeting(){
        return new Greeting();
    }
}
