package test.base.jupiter;

import org.junit.jupiter.api.Test;

public class ModuleTests {
@Test
    void NameIsTestBase(){
        var expected = "test.base"; //this is the name that we expect.
        var actualName = test.base.demo.ModuleDemo.class.getModule().getName();
        if(expected.equals(actualName)){
            System.out.println("ModuleDemo");
            return;
        }
        throw new AssertionError("wrong Name?");
    }
}
