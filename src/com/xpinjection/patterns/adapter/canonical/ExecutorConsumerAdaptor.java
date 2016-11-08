package com.xpinjection.patterns.adapter.canonical;

import java.util.concurrent.Executor;
import java.util.function.Consumer;

/**
 * @author Alimenkou Mikalai
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
