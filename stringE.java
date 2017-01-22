// Return true if the given string contains between 1 and 3 'e' chars.

public class StringE {
  public boolean stringE(String str) {
   int countE = 0;
   
   for (char c : str.toCharArray()) {
     if (c == 'e') {
       countE++;
     }
    }
  
    return countE > 0 && countE <= 3;
  }
}
