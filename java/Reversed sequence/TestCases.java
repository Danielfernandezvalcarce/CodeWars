import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;


public class SolutionTest {

  private int[] reverseSolution(int n){
    int[] result = new int[n];
    for(int i=n;i>0;i--){
      result[n-i]=i;
    }
    return result;
  }

    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Sequence.reverse(5));
        assertArrayEquals(new int[]{6,5,4,3,2,1},Sequence.reverse(6));
        assertArrayEquals(reverseSolution(100),Sequence.reverse(100));
        assertArrayEquals(reverseSolution(1000),Sequence.reverse(1000));
        assertArrayEquals(reverseSolution(100000),Sequence.reverse(100000));
        assertArrayEquals(reverseSolution(10000000),Sequence.reverse(10000000));
    }
    
    @Test
    public void randomTest(){
      for(int i=0;i<100;i++){
        int random = 1 + (int)(Math.random() * 9999);
        assertArrayEquals(reverseSolution(random),Sequence.reverse(random));
      }
    }
}