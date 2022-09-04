public class BonusMilesService {
    public int calculate(int cost) {
        int result;
        int stepOfRubles = 20;
        result = cost / stepOfRubles;
        return result;
    }
}
