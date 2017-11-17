package smm.springboot_ftl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ConfigurationProperties(prefix="jdbc") 
//@MapperScan("smm.springboot_ftl.mapper")
@SpringBootApplication
@EnableAutoConfiguration 
public class Application {
	
	public static void main(String[] args){
		SpringApplication.run(Application.class,args);
	}
}
