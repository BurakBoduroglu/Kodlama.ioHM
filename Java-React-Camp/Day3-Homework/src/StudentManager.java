
public class StudentManager extends UserManager{
	public void registerLecture(Student student) {
		System.out.println(student.getName()+ " " +student.getLastName() + " adl� ��renci " + 
	    student.get_Lecture() + " dersine kay�t oldu.");
	}
}
