package kodlamaIo;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private boolean isVerifiedEmail;

	public User(int id, String firstName, String lastName, String email, String userName, String password, boolean isVerifiedEmail) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.isVerifiedEmail = isVerifiedEmail;
	}
	
	public User(String firstName, String lastName, String email, String userName, String password, boolean isVerifiedEmail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.isVerifiedEmail = isVerifiedEmail;
	}
	
	//Getter - Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isVerifiedEmail() {
		return isVerifiedEmail;
	}

	public void setVerifiedEmail(boolean isVerifiedEmail) {
		this.isVerifiedEmail = isVerifiedEmail;
	};
	
}
