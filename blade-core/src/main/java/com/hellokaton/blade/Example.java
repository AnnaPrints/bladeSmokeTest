package com.hellokaton.blade;// Example.java
import java.util.ArrayList;  // Unused import, will trigger a warning

public class Example {

    @Deprecated
    private void deprecatedMethod() {
        System.out.println("This method is deprecated.");
    }

    public void useDeprecatedMethod() {
        deprecatedMethod();  // This will trigger a warning for deprecated method usage
    }

    @SuppressWarnings("unchecked")
    public void uncheckedCast() {
        ArrayList rawList = new ArrayList();  // raw type usage
        ArrayList<String> stringList = rawList;  // unchecked cast warning
        stringList.add("example");  // Adding to unchecked casted list
    }

    public void redundantCodeExample() {
        int unusedVariable = 42;  // Unused variable, will trigger a warning
        int result = 5 + 3;
    }
}
