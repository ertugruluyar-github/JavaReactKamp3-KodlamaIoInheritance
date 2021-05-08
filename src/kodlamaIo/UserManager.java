package kodlamaIo;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId() + " numaral� kullan�c� kaydedildi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " numaral� kullan�c� silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getId() + " numaral� kullan�c� g�ncellendi.");
	}
	
	public void changeFirstName(User user, String firstName) {
		user.setFirstName(firstName);
		System.out.println(user.getId() + " numaral� kullan�c�n�n ismi de�i�tirildi: " + firstName);
	}
	
	public void changeLastName(User user, String lastName) {
		user.setLastName(lastName);
		System.out.println(user.getId() + " numaral� kullan�c�n�n soyismi de�i�tirildi: " + lastName);
	}
	
	public void changeEmail(User user, String email) {
		user.setEmail(email);
		System.out.println(user.getId() + " numaral� kullan�c�n�n emaili de�i�tirildi: " + email);
	}
	
	public void changeUserName(User user, String userName) {
		user.setUserName(userName);
		System.out.println(user.getId() + " numaral� kullan�c�n�n kullan�c� ad� de�i�tirildi: " + userName);
	}
	
	public void changePassword(User user, String password) {
		user.setPassword(password);
		System.out.println(user.getId() + " numaral� kullan�c�n�n �ifresi de�i�tirildi: " + password);
	}
	
	public void verifyEmail(User user) {
		user.setVerifiedEmail(true);
		System.out.println(user.getId() + " numaral� kullan�c�n�n emaili ba�ar�yla onayland�.");
	}
	
}
