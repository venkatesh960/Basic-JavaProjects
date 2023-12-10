package StudentManagementSystem;

public class Student {
	private String sName;
	private int sRollNo;
	private String sGender;
	private String sFather;
	private int age;
	public Student(String sName, int sRollNo, String sGender, String sFather, int age) {
		this.sName = sName;
		this.sRollNo = sRollNo;
		this.sGender = sGender;
		this.sFather = sFather;
		this.age = age;
	}
	public Student() {
		
	}
	
	/**
	 * @return the sName
	 */
	public String getsName() {
		return sName;
	}
	/**
	 * @param sName the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
	}
	/**
	 * @return the sRollNo
	 */
	public int getsRollNo() {
		return sRollNo;
	}
	/**
	 * @param sRollNo the sRollNo to set
	 */
	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}
	/**
	 * @return the sGender
	 */
	public String getsGender() {
		return sGender;
	}
	/**
	 * @param sGender the sGender to set
	 */
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}
	/**
	 * @return the sFather
	 */
	public String getsFather() {
		return sFather;
	}
	/**
	 * @param sFather the sFather to set
	 */
	public void setsFather(String sFather) {
		this.sFather = sFather;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	public void studentInfo()
	{
		System.out.println("Student Name :"+getsName());
		System.out.println("Student RollNumber :"+getsRollNo());
		System.out.println("Student Father Name :"+getsFather());
		System.out.println("Student Age :"+getAge());
		System.out.println("Student Gender :"+getsGender());
	}
}
