package tokyo.kaisei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("tokyo.kaisei.dao.after")
@SpringBootApplication(scanBasePackages = {"tokyo.kaisei"})
public class OnlineshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineshopApplication.class, args);
	}

}
