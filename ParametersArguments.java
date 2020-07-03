/*
   - Parameters act as variables inside the method
   - Parameters are specified after the method name, inside the parentheses
   - You can add many parameters as you want, just separate them with a comma. 
   - When a parameter is passed to the method, it is called an argument.
*/ 

class ParametersArguments {
  static void myMethod(String fname, int age){
    System.out.println(fname + "is" + age);
  }
  
  public static void main(String[] args) {  
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);   
  }
}
