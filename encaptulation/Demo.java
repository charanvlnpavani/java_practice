package encaptulation;


class Student{
 private String name, rollno, course, branch, address;
 private long phoneNo;

 public void setName(String name){
  this.name = name;
 }
 public String getName(){
  return name;
 }
  public void setRollno(String rollno){
  this.rollno = rollno;
 }
 public String getRollno(){
  return rollno;
 }
  public void setCourse(String course){
  this.course = course;
 }
 public String getCourse(){
  return course;
 }
  public void setBranch(String branch){
  this.branch = branch;
 }
 public String getBranch(){
  return branch;
 }
  public void setAddress(String address){
  this.address = address;
 }
 public String getAddress(){
  return address;
 }
    public void setPhoneNo(long phoneNo){
  this.phoneNo = phoneNo;
 }
 public long getPhoneNo(){
  return phoneNo;
 }
}



public class Demo {
 public static void main(String[] args) {
  Student s1 = new Student();
  s1.setName("charan");
  s1.setRollno("207N1A0529");
  s1.setCourse("B.Tech");
  s1.setBranch("CSE");
  s1.setAddress("Hyderabad");
    s1.setPhoneNo(1234567890L);
  System.out.println("Name: " + s1.getName());
  System.out.println("Roll No: " + s1.getRollno());
  System.out.println("Course: " + s1.getCourse());   
  System.out.println("Branch: " + s1.getBranch());
  System.out.println("Address: " + s1.getAddress());
  System.out.println("Phone No: " + s1.getPhoneNo());  
 }
}

