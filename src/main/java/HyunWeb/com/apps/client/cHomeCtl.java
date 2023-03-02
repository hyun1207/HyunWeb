package HyunWeb.com.apps.client;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
/**
 * 로그인작성 할 때 주석풀기
 * @author Seunghyun
 *
 */
/* @RequestMapping(value = "/client") */
public class cHomeCtl {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = {"","/"} , method = {RequestMethod.GET,RequestMethod.POST} , produces = "application/json; charset=UTF-8") 
	public String cHome(HttpServletRequest request, HttpServletResponse response) {
		
		logger.info("Home Test");
		
		return "client/clientMain";
	}

	@RequestMapping(value = "/proFile", method = {RequestMethod.GET,RequestMethod.POST}, produces = "application/json; charset=UTF-8")
	public String proFile(HttpServletRequest request, HttpServletResponse response){

		logger.info("proFile Test");

		return "client/clientProFile";
	}




}
