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
	
	@RequestMapping(value = {"","/","/home"} , method = {RequestMethod.GET,RequestMethod.POST} , produces = "application/json; charset=UTF-8")
	public String cHome(HttpServletRequest request, HttpServletResponse response) {
		
		logger.info("Home Test");
		
		return "client/clientMain";
	}

	@RequestMapping(value = "/proFile", method = {RequestMethod.GET,RequestMethod.POST})
	public String proFile(HttpServletRequest request, HttpServletResponse response){

		logger.info("proFile Test");

		return "client/clientProFile";
	}

	@RequestMapping(value = "/portFolio", method = {RequestMethod.GET,RequestMethod.POST})
	public String portFolio(HttpServletRequest request, HttpServletResponse response){

		logger.info("proFile Test");

		return "client/clientPortFolio";
	}
	@RequestMapping(value = "/game", method = {RequestMethod.GET,RequestMethod.POST})
	public String game(HttpServletRequest request, HttpServletResponse response){

		logger.info("proFile Test");

		return "client/clientGame";
	}
	@RequestMapping(value = "/dailyLifeTip", method = {RequestMethod.GET,RequestMethod.POST})
	public String dailyLifeTip(HttpServletRequest request, HttpServletResponse response){

		logger.info("proFile Test");

		return "client/clientDailyLifeTip";
	}
	@RequestMapping(value = "/study", method = {RequestMethod.GET,RequestMethod.POST})
	public String study(HttpServletRequest request, HttpServletResponse response){

		logger.info("proFile Test");

		return "client/clientStudy";
	}
	@RequestMapping(value = "/setting", method = {RequestMethod.GET,RequestMethod.POST})
	public String setting(HttpServletRequest request, HttpServletResponse response){

		logger.info("proFile Test");

		return "client/clientSetting";
	}


}
