import java.util.Random;

public class Hello {
  public long getRandom() {
    Random r = new Random();
    return r.nextLong(100L, 500L);
  }
}

