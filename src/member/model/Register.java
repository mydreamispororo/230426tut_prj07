package member.model;

public class Register {
	private String userid;
	private String passwd;
	
	public Register() {}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String disp() {
		return "아이디 : " + userid + "\t 비밀번호 : " + passwd;
	}
	
	
	

}
