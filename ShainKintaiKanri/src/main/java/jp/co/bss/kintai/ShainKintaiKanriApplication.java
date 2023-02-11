package jp.co.bss.kintai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShainKintaiKanriApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShainKintaiKanriApplication.class, args);
	}

}
