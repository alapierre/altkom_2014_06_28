package com.oreilly.tiger.ch10;

import java.io.PrintStream;
import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
  
  private final BlockingQueue q;
  private final PrintStream out;

  public Consumer(String name, BlockingQueue q, 
                  PrintStream out) {
    setName(name);
    this.q = q;
    this.out = out;
  }

  public void run() {
    try {
      while (true) {
        process(q.take());
      }
    } catch (InterruptedException e) {
      out.printf("%s przerwany: %s", getName(), e.getMessage());
    }
  }

  private void process(Object obj) {
    out.printf("%s przetwarza obiekt:%n         '%s'%n", 
                getName(), obj.toString());
  }
}