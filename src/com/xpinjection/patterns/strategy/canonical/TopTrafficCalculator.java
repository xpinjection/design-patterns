package com.xpinjection.patterns.strategy.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class TopTrafficCalculator implements TrafficCalculator {
    private static final double[] TOP_RANKS = {0.5, 0.3, 0.1, 0.05, 0.05};

    @Override
    public int calculate(Position position) {
        int rank = position.getRank();
        if (rank < 0 || rank >= TOP_RANKS.length) {
            return 0;
        }
        return (int) (TOP_RANKS[rank] * position.getMediaValue());
    }
}
