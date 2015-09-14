// ============================================================================
//  File          : Stats
//  Created       : 12.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.prototype;

import java.util.Date;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public interface Stats<S> {
    S add(S delta);

    S invert(Date forDate);
}
