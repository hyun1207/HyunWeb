package HyunWeb.com.model;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * Login_Log 테이블
 * @author SeungHyun
 * 로그인한 회원목록 : 관리자전용
 */

@Data
public class LoginLogDto {
	
	private Long logNum; 						//로그번호
	
	private String loginIp;						//로그인IP
	
	private String loginUrl;					//로그인URL
	
	private String loginUserAgent; 				//로그인유저브라우저
	
	private boolean loginSuccessFlag;			//로그인성공여부
	
	private String loginFailRsn;				//로그인실패원인
	
	private String userId;						//사용자아이디
	
	private LocalDateTime loginDttm;			//로그인일시

}