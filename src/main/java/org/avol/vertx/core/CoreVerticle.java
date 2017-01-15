package org.avol.vertx.core;

import io.vertx.core.AbstractVerticle;

/**
 * Simple <code>{@link io.vertx.core.Verticle}</code> class.
 *
 * Created by Lovababu on 1/15/2017.
 */
public class CoreVerticle  extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        System.out.println("CoreVerticle.start");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("CoreVerticle.stop");
    }
}
