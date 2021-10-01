package model;

public class Student {
	String id;
	String fname;
	String lName;
	String mName;
	String email;
	String mobileNo;
	Address address;
	
	
	private static Student student;
	public Student() {
		
	}
	
	public static Student getInstance() {
		if(student == null) {
			return student = new Student();
		}
		return student;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lName=" + lName + ", mName=" + mName + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", address=" + address + "]";
	}
}
