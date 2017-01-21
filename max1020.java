public class Main {
  public int max1020(int a, int b) {
    int larger = 0;
    if (inRange(a) && inRange(b)) {
      return a > b ? a : b;
    } else if (inRange(a)) {
      return a;
    } else if (inRange(b)) {
      return b;
    }
    return larger;
  }

  public boolean inRange (int x) {
    return x >= 10 && x <= 20; 
  }
}
