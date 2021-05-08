package kodlamaIo;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId() + " numaralý kullanýcý kaydedildi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " numaralý kullanýcý silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getId() + " numaralý kullanýcý güncellendi.");
	}
	
	public void changeFirstName(User user, String firstName) {
		user.setFirstName(firstName);
		System.out.println(user.getId() + " numaralý kullanýcýnýn ismi deðiþtirildi: " + firstName);
	}
	
	public void changeLastName(User user, String lastName) {
		user.setLastName(lastName);
		System.out.println(user.getId() + " numaralý kullanýcýnýn soyismi deðiþtirildi: " + lastName);
	}
	
	public void changeEmail(User user, String email) {
		user.setEmail(email);
		System.out.println(user.getId() + " numaralý kullanýcýnýn emaili deðiþtirildi: " + email);
	}
	
	public void changeUserName(User user, String userName) {
		user.setUserName(userName);
		System.out.println(user.getId() + " numaralý kullanýcýnýn kullanýcý adý deðiþtirildi: " + userName);
	}
	
	public void changePassword(User user, String password) {
		user.setPassword(password);
		System.out.println(user.getId() + " numaralý kullanýcýnýn þifresi deðiþtirildi: " + password);
	}
	
	public void verifyEmail(User user) {
		user.setVerifiedEmail(true);
		System.out.println(user.getId() + " numaralý kullanýcýnýn emaili baþarýyla onaylandý.");
	}
	
}
