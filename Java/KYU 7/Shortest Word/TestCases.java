import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by Javatlacati on 01/03/2017.
 */
public class KataTest {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));

        assertEquals(3, Kata.findShort("lets talk about Java the best language"));
        assertEquals(1, Kata.findShort("i want to travel the world writing code one day"));
        assertEquals(2, Kata.findShort("Lets all go on holiday somewhere very cold"));
        assertEquals(2, Kata.findShort("Let's travel abroad shall we"));
    }

    public static int sol(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(c -> c.length()).min().getAsInt();
    }

    String[] names = new String[]{"Bitcoin", "LiteCoin", "Ripple", "Dash", "Lisk", "DarkCoin", "Monero", "Ethereum", "Classic", "Mine", "ProofOfWork", "ProofOfStake", "21inc", "Steem", "Dogecoin", "Waves", "Factom", "MadeSafeCoin", "BTC"};

    @Test
    public void randomTests() throws Exception {
        Random r = new Random();
        int tam = r.nextInt(names.length);
        String a = Arrays.stream(names).unordered().skip(names.length - tam).collect(Collectors.joining(" "));
        assertEquals(sol(a), Kata.findShort(a));
    }
}