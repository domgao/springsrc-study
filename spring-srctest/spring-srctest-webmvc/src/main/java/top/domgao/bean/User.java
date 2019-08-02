package top.domgao.bean;

public class User {
	private String userName = "domgao";
	private Integer age = 22;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getPassword() {
		return age;
	}

	public void setPassword(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"userName='" + userName + '\'' +
				", age=" + age +
				'}';
	}
}
