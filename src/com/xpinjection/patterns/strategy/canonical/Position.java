package com.xpinjection.patterns.strategy.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class Position {
    private int rank;
    private int mediaValue;

    public Position(int rank, int mediaValue) {
        this.rank = rank;
        this.mediaValue = mediaValue;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getMediaValue() {
        return mediaValue;
    }

    public void setMediaValue(int mediaValue) {
        this.mediaValue = mediaValue;
    }

    @Override
    public String toString() {
        return "Position{rank=" + rank + ", mediaValue=" + mediaValue + "}";
    }
}
