package object;

class MobileBrands{
 public static String brandMobile(){
  return "Nokia";
 }
}
class MobileModel{
 //default constructor
 public MobileModel(int x, int y){
  System.out.println("This is a default Constructor ");
 }
 public String modelMobile(int x, int y ){
  if (x > y){
   return "true";
  }
  return "false";
 }
}


public class mobileObject {
 public static void main(String[] args) {
  String result =MobileBrands.brandMobile();
  System.out.println("The brand is: " + result);
  int x = 20;
  int y = 10;
  MobileModel obj = new MobileModel(x,y);
  System.out.println(obj.modelMobile(x, y));


 }

 
}
