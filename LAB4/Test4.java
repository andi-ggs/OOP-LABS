package LAB4;

import java.util.Vector;

class Person {
	
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return name + " " +  address;
	}
}

class Student extends Person{
	
	public Vector courses = new Vector();
	public Vector grades = new Vector();
	
	public Student(String name, String Address) {
		super(name, Address);
	}
	
	public String toString() {
		return super.getName() + " " + super.getAddress(); 
	}
	
	public void addCourseGrade(String course, int grade) {
			courses.add(course);
			grades.add(grade);
	}
	
	public void printGrades() {
		System.out.println(grades);
	}
	
	public double getAverageGrade() {
		int i;
		double result = 0;
		int sum = 0;
		int nr = 0;
		
		for(i = 0; i < grades.size(); i++)
		{
			nr++;
			sum = sum + (int)grades.get(i);
		}
		
		result = sum / nr;
		return result;
	}
}

class Teacher extends Person {

	Vector courses = new Vector();
	
	public Teacher(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return super.getName() + " " + super.getAddress();
	}
	
	public boolean addCourse(String course) {
		
		int i = 0;
		for(i = 0; i < courses.size(); i++)
		{
			if(courses.get(i).equals(course))
				return false;
		}
		return true;
	}
	
	public boolean removeCourse(String course) {
		int i = 0;
		for(i = 0; i < courses.size(); i++)
		{
			if(courses.get(i).equals(course))
				{
				courses.remove(i);
				return true;
				}
		}
		return false;
	}

}

class Test4 {
    public static void main(String args[]) {
        Person student, teacher, test4;
        student = new Student("Popescu Ion", "Bucuresti");
        teacher = new Teacher("Ionescu Gigel", "Bucuresti");
        test4 = new Person("Maria", "Iasi");
        assert (test4.getName().equals("Maria")) : "Metoda getName din clasa Person nu este implementata corect";
        assert (((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Algoritmica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).addCourse("Matematica")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (((Teacher) teacher).removeCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        assert (!((Teacher) teacher).addCourse("Programare")) : "Metoda addCourse din clasa Teacher nu este " +
                "implementata corect";
        ((Student) student).addCourseGrade("Programare", 10);
        ((Student) student).addCourseGrade("Algoritmica", 9);
        ((Student) student).addCourseGrade("Matematica", 8);
        assert (Math.abs(((Student) student).getAverageGrade() - 9.00) <= 0.001) : "Metoda getAverageGrade din clasa " +
                "Student nu a fost implementat corect";
        ((Student) student).printGrades();
        //Ce metoda toString se va apela? Din ce clasa?
        System.out.println(student);
        System.out.println(test4);
        System.out.println("Felicitari! Problema a fost rezolvata corect!");
    }
}
