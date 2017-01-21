public class Main {
  public int close10() {
    int nearest = 0;
  
    if (Math.abs(10-a) != Math.abs(10-b)) {
    nearest = Math.abs(10-a) < Math.abs(10-b) ? a : b;
    }
    
    return nearest;
  }
}
