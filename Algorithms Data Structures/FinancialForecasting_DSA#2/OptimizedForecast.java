import java.util.HashMap;
import java.util.Map;

public class OptimizedForecast {
    private final Map<Integer, Double> memo = new HashMap<>();
    public double forecastMemoized(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double result = forecastMemoized(initialValue, growthRate, years - 1) * (1 + growthRate);
        memo.put(years, result);
        return result;
    }
}
