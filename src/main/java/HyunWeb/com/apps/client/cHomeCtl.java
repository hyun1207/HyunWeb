package HyunWeb.com.apps.client;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/client")
public class cHomeCtl {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "" , method = {RequestMethod.GET,RequestMethod.POST} , produces = "application/json; charset=UTF-8") 
	public String aHome(HttpServletRequest request, HttpServletResponse response) {
		
		logger.info("chomeTest");
		
		return "chome";
	}
	
}
