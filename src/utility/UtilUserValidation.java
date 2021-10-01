package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Address;
import model.Student;

public class UtilUserValidation{
	Student student = Student.getInstance();
	
	private static UtilUserValidation uservalidation;
	private UtilUserValidation() {
		
	}
	public static UtilUserValidation getInstance() {
		if(uservalidation == null) {
			return uservalidation = new UtilUserValidation();
		}
		return uservalidation;
	}
	
	public boolean startWithCapital(String str) {
		String pattern ="^[A-Z]{1}[A-Za-z]{2,9}$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		return m.matches();
	}
	
	public boolean validateEmail(String email) {
		String pattern = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+"
				+ "@[a-zA-Z0-9.-]+$$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(email);
		return m.matches();
	}
	
	public boolean validatePassword(String password) {
		String pattern =   "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])"
				+ "(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])."
				+ "{8,}$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(password);
		return m.matches();

	}
	
	public boolean validateMobileNo(String mNumber) {
		String pattern ="^((\\+|00)(\\d{1,3})[\\s-]?)?(\\d{10})$";
		//String pattern ="^[6-9]{1}[1-9]{9}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(mNumber);
		return m.matches();
	}
	
	public boolean validateId(String id) {
		String pattern ="\\d{1,5}$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(id);
		return m.matches();
	}
	public boolean validateAddress(Address address) {
		boolean flag = false;
		if(address == null) {
			System.out.println("Address cant be Empty.");
			flag = true;
		}
		return flag;
	}
}
