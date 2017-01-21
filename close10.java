// Given 2 int values, return whichever value is nearest to the value 10, 
// or return 0 in the event of a tie. 

public class Main {
  public int close10() {
    int nearest = 0;
  
    if (Math.abs(10-a) != Math.abs(10-b)) {
    nearest = Math.abs(10-a) < Math.abs(10-b) ? a : b;
    }
    
    return nearest;
  }
}
