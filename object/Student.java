package object;
class StudentMarks {
 public void StudentDetails(String name, int marks){
  System.out.println("Student Name: " + name);
  System.out.println("Student Marks: " + marks);
 }
}

public class Student {
 public static void main(String[] args) {
  StudentMarks obj = new StudentMarks();
  obj.StudentDetails("John", 85);
  obj.StudentDetails("Alice", 92);


 
 }
 
} 
