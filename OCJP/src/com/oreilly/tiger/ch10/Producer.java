package com.oreilly.tiger.ch10;

import java.io.PrintStream;
import java.util.Date;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {

  private final BlockingQueue q;
  private final PrintStream out;

  public Producer(BlockingQueue q, PrintStream out) {
    setName("Producent");
    this.q = q;
    this.out = out;
  }

  @Override
  public void run() {
    try {
      while (true) {
        q.put(produce());
      }
    } catch (InterruptedException e) {
      out.printf("%s przerwany: %s", getName(), e.getMessage());
    }
  }

  private String produce() {
    while (true) {
      double r = Math.random();

      // Posuwa się tylko 1/10 czasu

      if ((r*100) < 10) {
        String s = String.format("Wstawiony %tc", new Date());
        return s;
      }
    }
  }
}