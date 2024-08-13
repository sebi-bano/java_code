package extractProg;

public class Lowercase {

	public char upper(char b) {
		return Character.toUpperCase(b);

	}
      public boolean lower(char b) {
    	  b=Character.toLowerCase(b);
    	  return b=='a'|| b=='e' || b=='i' || b=='o'||b=='u';
      }
}
