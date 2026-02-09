package encaptulation;

class EmpleyeeDetails {
 private String name, id, role, address;
 private long phoneNo;

 public void setName(String name){
  this.name = name;
 }
 public String getName(){
  return name;
 }
 public void setId(String id){
  this.id = id;
 }
 public String getId(){
  return id;
 }
 public void setRole(String role){
  this.role = role;
 }
 public String getRole(){
  return role;
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

public class Employee {
 public static void main(String[] args) {
  EmpleyeeDetails e1 = new EmpleyeeDetails();
  e1.setName("Charan");
  e1.setId("E123");
  e1.setRole("Software Engineer");
  e1.setAddress("Hyderabad");
  e1.setPhoneNo(9876543210L);
  System.out.println("Name: " + e1.getName());
  System.out.println("ID: " + e1.getId());
  System.out.println("Role: " + e1.getRole());
  System.out.println("Address: " + e1.getAddress());
  System.out.println("Phone No: " + e1.getPhoneNo());
 } 
}
