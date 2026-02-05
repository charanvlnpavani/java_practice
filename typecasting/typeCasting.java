package typecasting;

public class typeCasting {
 public static void main(String[] args) {
  // Implicit Type Casting (Widening)
  System.out.println("\nImplicit Type Casting:" );
     int v = 100;
     long l = v;
     float f = l;
     double d = f;
     System.out.println("Integer value: " + v);
     System.out.println("Long value: " + l);
     System.out.println("Float value: " + f);
     System.out.println("Double value: " + d);
    //Explicit Type Casting (Narrowing)
    System.out.println( "\nExplicit Type Casting:");
    double dd= 4.5;
    float ff = (int) dd;
    long ll = (long) ff;
    int ii = (int) ll;
    System.out.println("Integer value: " + ii);
    System.out.println("Long value: " + ll);
    System.out.println("Double value: " + dd);
    System.out.println("Float value: " + ff);
 }
 
}
