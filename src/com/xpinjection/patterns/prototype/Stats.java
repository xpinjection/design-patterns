package com.xpinjection.patterns.prototype;

import java.util.Date;

/**
 * @author Alimenkou Mikalai
 */
public interface Stats<S> {
    S add(S delta);

    S invert(Date forDate);
}
