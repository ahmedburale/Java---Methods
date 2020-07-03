// Instead of defining two methods that should do the same thing, it is bettter to overload one. 
// The example below, we overloaded the plusMethod to work for both int and double:
// Note: Multiple methods can have the same name as long as the number and/or type of parameters are different. 
class OverloadedMethod {
  
  static int plusMethod(int x, int y){
    return x + y;
  }
  
  static double plusMethod(double x, double y){
    return x + y;
    
  }
  
  public static void main(String[] args) {
    int myNum1 = plusMethod(8, 5);
    double myNum2 = plusMethod(4.3, 6.26);
    System.out.println("int: " + myNum1);    
    System.out.println("double: " + myNum2);
    
  }
}
