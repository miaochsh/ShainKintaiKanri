package jp.co.bss.kintai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.test.mapper")
public class ShainKintaiKanriApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShainKintaiKanriApplication.class, args);
    }

}