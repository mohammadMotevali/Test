/**
 * 
 * @author mohammad
 * @since 2020
 *
 */
public class Student {
	
	private String firstName;
	private String lastName;
	private String id;
	private int grade;
	
	/**
	 * create a new student:
	 * 
	 * @param fName this is first name of student
	 * @param lName this is last name of student
	 * @param id this is student number
	 */
	
	public Student(String fName, String lName, String id) {
		firstName = fName;
		lastName = lName;
		this.id = id;
		grade = 0;
	}
	/**
	 * get the first name of student
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * 
	 * @param firstName set for name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * get the last name of student
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * 
	 * @param lastName set for last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * get the id of student
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 
	 * @param id set id(7 digit)
	 */
	public void setId(String id) {
		if( id.length() == 7 ) {
			this.id = id;
		}
	}
	/**
	 * 
	 * @param grade set for grade of student
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	/**
	 * print the information of student
	 */
	public void display() {
		System.out.println(lastName + "     student id: " + id +"        grade: " + grade);
	}
	
}
