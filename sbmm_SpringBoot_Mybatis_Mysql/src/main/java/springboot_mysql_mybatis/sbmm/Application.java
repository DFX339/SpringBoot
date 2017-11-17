package springboot_mysql_mybatis.sbmm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springboot_mysql_mybatis.sbmm.action.UserController;

/**
 * SpringBoot的主类
 * @author Administrator
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args){
		SpringApplication.run(UserController.class, args);
	}
}
