package javadb191230;

public class Member {
	private String id;
	private String password;
	private String name;
	private String birth;
	private String email;
	private String phone;
	
	@Override
	public String toString() {
		return "Member [아이디=" + id + ", 비밀번호=" + password + ", 이름=" + name + ", 생일=" + birth + ", 이메일="
				+ email + ", 연락처=" + phone + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
