open /*test*/ module test.base {
  // module under test
  requires java.base;

  // modules we're testing with...
  requires org.junit.jupiter;
  requires com.github.sormuras.mainrunner.engine;
  requires org.assertj.core;
  requires net.jqwik.api;
  requires org.junit.platform.suite;
}
