package HyunWeb.com.spring.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class WebSecurityCtl {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// User 서비스 추가
	// 웹 서비스 추가
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String index(Authentication authentication,
			HttpServletRequest request,
			HttpServletResponse response,
			Model model) {
		
		// 인증이 되었다면 index
		if( authentication != null) {
			return "index";
		} else {
			// 아니라면 login페이지
			return "login"; 
		}
		
    	/**
		HttpSession session = request.getSession();

        if (authentication != null) {
            logger.info("-------로그인 화면으로 리턴합니다.----------");

            return "redirect:client";
        } else {

            ModelAndView mav = new ModelAndView();

            return "redirect:admin";
        }
        */
    }
	
	
	
}
