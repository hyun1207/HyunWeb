package HyunWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * Spring Security 의존성을 추가는 했지만, 인증단계를 개발하지 않은 경우
 * (exclude = SecurityAutoConfiguration.class) 추가
 * @author Seunghyun
 *
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class HyunWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyunWebApplication.class, args);
	}

}
