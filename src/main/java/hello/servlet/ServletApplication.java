package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ServletComponentScan
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

	/**
	 * application.properties에 선언한 내용과 상동
	 * springMVC가 자동으로 해줌
	 @Bean
	 InternalResourceViewResolver internalResourceViewResolver(){
	 return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	 }
	 */


}
