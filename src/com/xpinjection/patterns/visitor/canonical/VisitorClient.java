// ============================================================================
//  File          : VisitorClient
//  Created       : 13.09.2016   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2016 XP Injection, Ukraine
// ============================================================================
package com.xpinjection.patterns.visitor.canonical;

import java.util.Arrays;
import java.util.List;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class VisitorClient {
    public static void main(String[] args) {
        List<Element> figures = Arrays.asList(new Circle(4), new Square(5), new Rectangle(6, 7));

        double totalArea = 0.0;
        Visitor<Double> areaVisitor = new AreaVisitor();
        for (Element figure : figures) {
            totalArea += figure.accept(areaVisitor);
        }
        System.out.println("Total area = " + totalArea);

        double totalPerimeter = 0.0;
        Visitor<Double> perimeterVisitor = new PerimeterVisitor();
        for (Element figure : figures) {
            totalPerimeter += figure.accept(perimeterVisitor);
        }
        System.out.println("Total perimeter = " + totalPerimeter);
    }
}
