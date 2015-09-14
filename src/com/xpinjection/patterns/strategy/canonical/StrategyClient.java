// ============================================================================
//  File          : StrategyClient
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.strategy.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
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
