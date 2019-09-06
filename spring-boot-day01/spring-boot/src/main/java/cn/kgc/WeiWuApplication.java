package cn.kgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.kgc")
public class WeiWuApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeiWuApplication.class,args);
    }
}
