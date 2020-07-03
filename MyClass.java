
class MyClass {
  /*
  Name of the method - myMethod()
  static - mean methods belongs to the MyClass and not an object of the MyClass class
  void - means this method does not have a return value. 
  */
  static void myMethod() 
  {
    System.out.println("I just got executed");
  }
  public static void main(String[] args) {
  
  // A method can also be called multiples times. 
  myMethod();
  myMethod();
  myMethod();

    
  }
}
