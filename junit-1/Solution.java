import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * [junit-1]
 * An Example how to code a JUnit.
 */

public class Solution {
  
  @Test
  public void shouldDoIt() {
    assertEquals("test", "test");
  }
  
  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("Solution");
  }
  
}