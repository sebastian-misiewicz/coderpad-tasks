import java.io.*;
import java.util.*;
import static org.junit.Assert.*;

/*
 * [design-patterns-2]
 * Implement a Builder Pattern.
 */

class Solution {
  public static void main(String[] args) {
    // TODO Build anObject using a builder pattern
    AnObject anObject;
    
    assertEquals(
      "AnObject [aString=string, anInteger=123, aCharacter=c]",
      anObject.toString());
  }
}


class AnObject {

  private String aString;

  private Integer anInteger;

  private Character aCharacter;

  private AnObject() {
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("AnObject [aString=");
    builder.append(aString);
    builder.append(", anInteger=");
    builder.append(anInteger);
    builder.append(", aCharacter=");
    builder.append(aCharacter);
    builder.append("]");
    return builder.toString();
  }

}