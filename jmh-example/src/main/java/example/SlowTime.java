package example;

public class SlowTime {

  public static long currentTimeMillis() {
    try { Thread.sleep(100); } catch (InterruptedException e) { }
    return System.currentTimeMillis();
  }
}
