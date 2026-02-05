package conditionalOperation;

public class condionalOperation {
 public static void main(String[] args) {
  int a = 23;
  int b = 45;
  if(a>b){
   System.out.println("a is greater than b");
  }
  else{
   System.out.println("b is greater than a");
  }
  System.out.println(a>b ? "a is greater than b" : "b is greater than a");
 }
}
