import static org.junit.Assert.*;
import org.junit.*;

public class testwordcount{
    @Test 
    public void Testcase(){//rely on main method in testing files
        assertEquals(3, gitfile.countWords("all is well"));
        assertEquals(5, gitfile.countWords(" all is well "));
        //javac -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar <methodfile><testingfile>
        //java -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:.org.junit.runner.JunitCore <testingfile>
    }
}
