// ============================================================================
//  File          : ExecutorConsumerAdaptor
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.xpinjection.patterns.adapter.canonical;

import java.util.concurrent.Executor;
import java.util.function.Consumer;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ExecutorConsumerAdaptor implements Consumer<Runnable> {
    private final Executor executor;

    public ExecutorConsumerAdaptor(Executor executor) {
        this.executor = executor;
    }

    @Override
    public void accept(Runnable task) {
        executor.execute(task);
    }
}
