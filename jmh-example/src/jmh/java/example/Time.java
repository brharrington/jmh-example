package example;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Time {

  @Benchmark
  public long currentTimeMillis() {
    return System.currentTimeMillis();
  }

  @Benchmark
  public long nanoTime() {
    return System.nanoTime();
  }

  public static void main(String[] args) throws RunnerException {
    Options opt = new OptionsBuilder()
        .include(".*")// + Time.class.getSimpleName() + ".*")
        .forks(1)
        .build();
    new Runner(opt).run();
  }
}
