package test.base.demo;

public class ModuleDemo {
    public static void main(String[] args){
        var expected = "test.base"; //this is the name that we expect.
        var actualName = ModuleDemo.class.getModule().getName();
        if(expected.equals(actualName)){
            System.out.println("ModuleDemo");
            return;
        }
        throw new AssertionError("wrong Name?");
    }
}
