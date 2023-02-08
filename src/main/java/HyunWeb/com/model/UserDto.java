package HyunWeb.com.model;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * User
 * @author SeungHyun
 *
 */
@Data
public class UserDto {
	
	private String userId;				//UserId_유저아이디
	
	private String userName;			//UserName_유저이름
	
	private String userPwd;				//UserPassword_유저비밀번호
	
	private String userEmail;			//UserEmail_유저이메일
	
	private String userBirthDay;		//UserBirthDay_유저생일
	
	private LocalDateTime lastDttm;		//lastDttm_마지막접속시간
	
	private LocalDateTime updateDttm;	//updateDttm_정보업데이트시간?
	
	private String role;				// admin인지 user인지 체크
	
	private Long LgnFailCnt;			//Login실패횟수
	
	
}
