public class GameConfig {

    private int max_attempts;
    private int min;
    private int max;

    //constructor
    public GameConfig(int max_attempts, int min, int max) {
        this.max_attempts = max_attempts;
        this.min = min;
        this.max = max;
    }

    //methods
    public int getMax_attempts() {
        return max_attempts;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }


}
