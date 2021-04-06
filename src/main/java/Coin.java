public class Coin {

    private  double headProbability;
    private double tailProbability;
    public Coin(double headProbability, double tailProbability) {
        this.headProbability = headProbability;
        this.tailProbability = tailProbability;
    }

    public boolean probabilityIsEqual() {
        if(headProbability == tailProbability) {
            return true;
        }
        return false;
    }


}
