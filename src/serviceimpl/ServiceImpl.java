package serviceimpl;

import model.Address;
import model.Student;
import service.IStudentService;
import utility.UtilScanner;
import utility.UtilUserValidation;
public class ServiceImpl implements IStudentService {
	private static ServiceImpl serviceimpl;
	public ServiceImpl() {
		
	}
	public static ServiceImpl getInstance() {
		if(serviceimpl == null) {
			return serviceimpl= new ServiceImpl();
		}
		return serviceimpl;
	}
	
	@Override
	public void addStudent(Student student) {
		UtilUserValidation validate = UtilUserValidation.getInstance();
		Address address = Address.getInstance();
		
		
		student.setId(UtilScanner.getString("Id: "));
		boolean id = validate.validateId(student.getId());
		while(id == false) {
			System.out.println("ENTER ONLY DIGITS.MAX-LENGTH=> 6");
			student.setId(UtilScanner.getString("ReEnter Id: "));
			id = validate.validateId(student.getId());
		}

		student.setFname(UtilScanner.getString("firstName: "));
		boolean capital = validate.startWithCapital(student.getFname());
		while(capital == false) {
			System.out.println("First letter Capital and Maxlenth : 10");
			student.setFname(UtilScanner.getString("ReEnter firstName: "));
			capital = validate.startWithCapital(student.getFname());
		}
		
		student.setmName(UtilScanner.getString("MiddleName: "));
		boolean capitalmName = validate.startWithCapital(student.getmName());
		while(capitalmName == false) {
			System.out.println("First letter Capital and Maxlenth : 10");
			student.setmName(UtilScanner.getString("ReEnter MiddleName: "));
			capitalmName = validate.startWithCapital(student.getmName());
		}
		
		student.setlName(UtilScanner.getString("LastName: "));
		boolean capitalLName = validate.startWithCapital(student.getlName());
		while(capitalLName == false) {
			System.out.println("First letter Capital and Maxlenth : 10");
			student.setlName(UtilScanner.getString("ReEnter LastName: "));
			capitalLName = validate.startWithCapital(student.getlName());
		}
		
		student.setEmail(UtilScanner.getString("EMail: "));
		boolean email = validate.validateEmail(student.getEmail());
		while(email == false) {
			System.out.println("Use proper format Email.");
			student.setEmail(UtilScanner.getString("ReEnter Email: "));
			capitalLName = validate.validateEmail(student.getEmail());
		}
		
		student.setMobileNo(UtilScanner.getString("Mobile No: "));
		boolean mobNo = validate.validateMobileNo(student.getMobileNo());
		while(mobNo == false) {
			System.out.println("Either 10 digits or 12 digits with "
					+ "country code");
			student.setMobileNo(UtilScanner.getString("ReEnter Mobile No: "));
			mobNo = validate.validateMobileNo(student.getMobileNo());
		}
		
		System.out.println("Address:=>");
		address.setLandMark(UtilScanner.getString("LandMark: "));
		address.setCity(UtilScanner.getString("City: "));
		address.setPinCode(UtilScanner.getString("Pincode: "));
		
		student.setAddress(address);
		boolean emptyAdress = validate.validateAddress(address);
		while(emptyAdress) {
			System.out.println("Cant leave address Empty.");
			address.setLandMark(UtilScanner.getString("LandMark: "));
			address.setCity(UtilScanner.getString("City: "));
			address.setPinCode(UtilScanner.getString("Pincode: "));
			
			student.setAddress(address);
			emptyAdress = validate.validateAddress(address);
		}
	}
	public void display() {
		
		Student student = Student.getInstance();
		Address address = Address.getInstance();
		
		System.out.println("\n\n!!!....Student Management.....!!!\n");
		System.out.println("1.)Name	 : "+student.getFname()+" "
		+student.getmName()+" "+student.getlName());
		System.out.println("2.)Email : "+student.getEmail());
		System.out.println("3.)Mobile: "+student.getMobileNo());
		System.out.println("4.)Address: \n"+"	->Landmark: "
									+address.getLandMark());
		System.out.println("	->City: "+address.getCity()+"\n"+""
				+ "	->PinCode: "+address.getPinCode());
		System.out.println("............(END)..................");
	}
}
