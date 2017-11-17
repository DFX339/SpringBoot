package smm.bootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties(prefix="jdbc") 
@MapperScan("smm.bootdemo.mapper")
@SpringBootApplication
public class Application {
	
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}
