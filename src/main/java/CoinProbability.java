import java.util.Objects;

public class CoinProbability {

    private  double headProbability;
    private double tailProbability;
    public CoinProbability(double headProbability, double tailProbability) {
        this.headProbability = headProbability;
        this.tailProbability = tailProbability;
    }

    @Override
    public boolean equals(Object o) {
        CoinProbability coinProbability = (CoinProbability) o;
        return Double.compare(coinProbability.headProbability, this.tailProbability) == 0;
    }

}
