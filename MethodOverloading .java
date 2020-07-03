/* With method overloading, multiple methods can have the same name with different parameters: 
   Example; int myMethod(int x), float myMethod(float x), double myMethod(double x, double y)
*/ 

class MethodOverloading 
{

  //Overload method1 - two interger arguments
  static int plusMethodInt (int x, int y)
  {
    return x + y;
  }
 //Overload method2 - two double arguments
  static double plusMethodDouble(double x, double y)
  {
    return x + y;
  }
 //Main method - input/output 
  public static void main(String[] args) 
  {
    int myNum1 = plusMethodInt(8, 5);
    double myNum2 = plusMethodDouble(4.3, 6.26);  
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);  
    
  }// End of method 
 
} // End of class. 
