package com.xpinjection.patterns.strategy;

import com.xpinjection.patterns.strategy.canonical.Position;

/**
 * @author Alimenkou Mikalai
 */
public final class TrafficCalculationStrategies {
    private static final int PAGE_SIZE = 10;
    private static final double[] TOP_RANKS = {0.5, 0.3, 0.1, 0.05, 0.05};

    private TrafficCalculationStrategies() {}

    public static int calculateTrafficForPage(Position position) {
        int rank = position.getRank();
        if (rank < 0) {
            return 0;
        }
        int page = rank / PAGE_SIZE;
        return position.getMediaValue() / (PAGE_SIZE * (page + 1));
    }

    public static int calculateTopTrafficOnly(Position position) {
        int rank = position.getRank();
        if (rank < 0 || rank >= TOP_RANKS.length) {
            return 0;
        }
        return (int) (TOP_RANKS[rank] * position.getMediaValue());
    }
}
