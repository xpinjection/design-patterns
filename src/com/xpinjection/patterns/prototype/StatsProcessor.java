// ============================================================================
//  File          : StatsFilter
//  Created       : 12.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.prototype;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class StatsProcessor {
    public List<Stats> process(long domainId, List<TrafficStats> stats) {
        Date now = new Date();
        return stats.stream()
                .filter(stat -> stat.getDomainId() == domainId)
                .map(stat -> stat.invert(now))
                .collect(Collectors.toList());
    }
}
