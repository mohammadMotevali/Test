
public class Run {

	public static void main(String[] args) {
		Student std1 = new Student("mohammad", "motevali", "9831100");
		Student std2 = new Student("ali", "motevali", "9831200");
		
		std1.display();
		std1.setGrade(20);
		std2.setFirstName("mamad");
		System.out.println(std1.getFirstName());
		std1.display();
	}

}
