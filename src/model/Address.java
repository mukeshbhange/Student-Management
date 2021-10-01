package model;

public class Address {
	
	private static Address addressInstance;
	public Address() {
		
	}
	public static Address getInstance() {
		if(addressInstance == null) {
			return addressInstance = new Address();
		}
		return addressInstance;
	}
	
	
	String landMark;
	String city;
	String pinCode;
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [landMark=" + landMark + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
}
