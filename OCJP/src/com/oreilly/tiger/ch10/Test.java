/*
 * OCJP Łódź 2014-06-29 dla Altkom Akademia S.A.

 */

package com.oreilly.tiger.ch10;

import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Test {
    
    public void testQueue(PrintStream out) throws IOException {
    BlockingQueue queue = new LinkedBlockingQueue(10);
    Producer p = new Producer(queue, out);
    Consumer c1 = new Consumer("Konsument 1", queue, out);
    Consumer c2 = new Consumer("Konsument 2", queue, out);
    Consumer c3 = new Consumer("Konsument 3", queue, out);
    Consumer c4 = new Consumer("Konsument 4", queue, out);

    p.start(); c1.start(); c2.start(); c3.start(); c4.start();
    try {
      MILLISECONDS.sleep(100);
    } catch (InterruptedException ignored) { }

    // Zatrzymuje wątki
    p.stop();
    c1.stop(); c2.stop(); c3.stop(); c4.stop();
  }

    
}
