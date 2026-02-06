package object;
class InnercreateObject {
 public int sum(int a, int b){
  int add = a+b;
  return  add;
 }
}
public class createObject {
 public static void main(String[] args) {
  int a = 10, b = 20;
  InnercreateObject obj = new InnercreateObject();
  int result = obj.sum(a,b);
  System.out.println("The sum is: " + result );
 } 
}
