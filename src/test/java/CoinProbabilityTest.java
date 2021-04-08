import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinProbabilityTest {
    double headProbability = 0.5;
    double tailProbability = 0.5;
    @Test
    public void testIfHeadProbabilityOfACoinIsEqualToTailProbability() {
        CoinProbability coinProbability = new CoinProbability(headProbability,tailProbability);

        assertEquals(coinProbability, coinProbability);
    }

    @Test
    void testIfProbabilityOfTossingTwoCoinsSimultaneouslyWithBothTheSidesAsHeadIs0Point25() {
        double expectedValue = 0.25;
        CoinProbability coin1headProbability = new CoinProbability(headProbability);
        CoinProbability coin2headProbability = new CoinProbability(headProbability);

        double actualValue = coin2headProbability.probabilityOfTwoEventsThatOccurTogether(coin1headProbability);

        assertEquals(expectedValue,actualValue);
    }


}
