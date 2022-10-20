package week3.assignment;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id of student is " +id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("id of stsudent is " +id);
		System.out.println("name of student is " +name);
	}
	public void getStudentInfo(long phonenumber , String email) {
		System.out.println("phone number is " +phonenumber);
		System.out.println("email is " +email);
	}

	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(1234);
		s.getStudentInfo(1234, "geetha");
		s.getStudentInfo(12345678L," geetha.r@gmail.com");

	}

}
