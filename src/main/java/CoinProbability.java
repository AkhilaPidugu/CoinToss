public class CoinProbability {

    private double side;
    private double headProbability;
    private double tailProbability;

    public CoinProbability(double headProbability, double tailProbability) {
        this.headProbability = headProbability;
        this.tailProbability = tailProbability;
    }

    public CoinProbability(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        CoinProbability coinProbability = (CoinProbability) o;
        return Double.compare(coinProbability.headProbability, this.tailProbability) == 0;
    }

    public double and(CoinProbability coinProbability) {
        return this.side*coinProbability.side;
    }

    public double complement() {
        return 1-this.side;
    }
}
