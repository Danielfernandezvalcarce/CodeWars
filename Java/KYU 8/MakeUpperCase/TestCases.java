import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.stream.*;
import java.util.Random;

public class SolutionTest {

    Upper u = new Upper();

    @Test
    public void testSomething() {
       assertEquals("HELLO",u.MakeUpperCase("hello"));
       assertEquals("HELLO WORLD",u.MakeUpperCase("hello world"));
       assertEquals("HELLO WORLD !",u.MakeUpperCase("hello world !"));
       assertEquals("HELLO WORLD !",u.MakeUpperCase("heLlO wORLd !"));
       assertEquals("1,2,3 HELLO WORLD!",u.MakeUpperCase("1,2,3 hello world!"));
    }
  
    @Test
    public void randomTests(){
      Random r = new Random();
      String letters = "abcdefgh ijklmnopq rstuvwxyz ABCDEFGHIJ QLMNOPQRSTUVWXYZ 1234567890!";
      
      for(int i = 0; i < 100; i++){
        String s = IntStream.range(1, r.nextInt(100))
                  .mapToObj(x-> Character.toString(letters.charAt(r.nextInt(letters.length()))))
                  .collect(Collectors.joining());
        
        String expected = s.toUpperCase();
        assertEquals(expected, u.MakeUpperCase(s));
      
      }
    }
  }