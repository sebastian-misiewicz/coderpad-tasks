import java.io.*;
import java.util.*;

/*
 * [design-patterns-1]
 * Implement an Observer Pattern.
 */

class Solution {
  public static void main(String[] args) {
    Subject subject = new Subject();
    
    subject.subscribe(new AnObject());
    subject.subscribe(new AnotherObject());
    
    subject.dispatch();
  }
}


class Subject {
  
  public void subscribe(Observator observator) {
    // TODO
  }
  
  public void dispatch() {
    // TODO
  }
  
}

class AnObject implements Observator {
  
  public void update() {
    System.out.println("It's AnObject");
  }
  
}

class AnotherObject implements Observator {
   
  public void update() {
    System.out.println("It's AnotherObject");
  }
  
}

interface Observator {
  
  public void update();
  
}