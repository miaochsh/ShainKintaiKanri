package jp.co.bss.kintai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("jp.co.bss.kintai.mapper")
public class ShainKintaiKanriApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShainKintaiKanriApplication.class, args);
    }

}