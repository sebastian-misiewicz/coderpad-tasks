import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * [algorithm-1]
 * Given a string of opening and closing parentheses, check whether it’s balanced. 
 * We have 3 types of parentheses: 
 * - round brackets: (), 
 * - square brackets: [], 
 * - and curly brackets: {}. 
 * Assume that the string doesn’t contain any other character than these, no spaces words or numbers. 
 * Just to remind, balanced parentheses require every opening parenthesis to be closed in the reverse order opened. 
 * For example ‘([])’ is balanced but ‘([)]‘ is not.
 */

class Parentheses {
  
  public boolean isBalanced(String bracketString) {
    return true;
  }
  
}


public class Solution {
  
  private Parentheses parentheses = new Parentheses();
  
  @Test
  public void shouldBeBalanced() {
    assert2True("[({})]");
  }
  
  @Test
  public void shouldNotBeBalanced() {
    assert2False("([)]");
  }
  
  @Test
  public void shouldBeBalanced2() {
    assert2False("[]{}()");
  }
  
  @Test
  public void shouldNotBeBalanced2() {
    assert2False("((((((([[]])))))){)}");
  }
  
  private void assert2True(String bracketString) {
    assertTrue(parentheses.isBalanced(bracketString));
  }
  
  private void assert2False(String bracketString) {
    assertFalse(parentheses.isBalanced(bracketString));
  }
  