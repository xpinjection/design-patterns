package com.xpinjection.patterns.strategy.canonical;

/**
 * @author Alimenkou Mikalai
 */
public class StrategyClient {
    private final TrafficCalculator calculator;

    public StrategyClient(TrafficCalculator calculator) {
        this.calculator = calculator;
    }

    public static void main(String[] args) {
        Position position = new Position(3, 1000);
        new StrategyClient(new TopTrafficCalculator()).process(position);
        new StrategyClient(new PageTrafficCalculator()).process(position);
    }

    public void process(Position position) {
        int traffic = calculator.calculate(position);
        System.out.println("Traffic is " + traffic + " for position " + position);
    }
}
