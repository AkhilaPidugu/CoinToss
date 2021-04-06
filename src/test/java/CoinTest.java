import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTest {
    @Test
    public void testIfHeadProbabilityOfACoinIsEqualToTailProbability() {
        boolean actualValue;
        double headProbability = 0.5;
        double tailProbability = 0.5;
        Coin coin= new Coin(headProbability,tailProbability);

        actualValue = coin.probabilityIsEqual();

        assertTrue(actualValue);
    }

}
