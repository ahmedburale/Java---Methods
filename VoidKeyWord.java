/*
If we didn’t want a value returned from the method, the void keyword 
would be used. In the example below, we have a method named 
methodRankPoints – because we don’t want a value from this method
it is a void method. To call it you will need a statement as you can see 
in this example code:
*/
class VoidKeyword {
  public static void main(String[] args) { 
    methodRankPoints(255.7); 
  } 
  
  public static void methodRankPoints(double points) { 
    if (points >= 202.5) { 
      System.out.println("Rank:A1"); 
    }
    else if (points >= 122.4) { 
      System.out.println("Rank:A2"); 
    }
    else { 
      System.out.println("Rank:A3"); 
    } 
  }
}
