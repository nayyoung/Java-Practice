public class Main {
  public boolean in3050(int a, int b) {
    boolean range30 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
    boolean range40 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
  
    return range30 || range40;
  }
}
