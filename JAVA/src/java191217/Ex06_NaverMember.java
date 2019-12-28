package java191217;

public class Ex06_NaverMember {
	
	// NaverMember 만들기
	// id, pw, name, birth, gender, mail, number
	private String id;
	private String password;
	private String name;
	private String birth;
	private String gender;
	private String email;
	private String phone;
	
	// id 필드값을 저장하고 가져오고 싶을 때 getter(가져오고), setter(설정한다) 메소드
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	// 모든 필드를 매개변수로 하는 생성자 선언 후
	// main 클래스에서 신규 회원을 하나 등록해 보세요
	public Ex06_NaverMember(String id, String password, String name, String birth, String gender, String email,
			String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "NaverMember [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", gender="
				+ gender + ", email=" + email + ", phone=" + phone + "]";
	}
	
	/* NaverMember 클래스에 기본 생성자를 선언하여
	 * 기본 생성자를 이용해 member1 객체를 선언한 뒤 모든 필드 값을 본인 옆사람의 정보로 지정해보세요
	 */
	//기본 생성자 선언
	Ex06_NaverMember(){
	}
	
	
	
}
