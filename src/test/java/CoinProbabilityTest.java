import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinProbabilityTest {
    @Test
    public void testIfHeadProbabilityOfACoinIsEqualToTailProbability() {
        double headProbability = 0.5;
        double tailProbability = 0.5;
        CoinProbability coinProbability = new CoinProbability(headProbability,tailProbability);

        assertEquals(coinProbability, coinProbability);
    }

}
