package com.first.first.firstV;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class FirstVerticle extends AbstractVerticle{
	
	 public void start(Future<Void> startPromise) throws Exception {
		 System.out.println("FirstVerticle.start()");
	   }
	

}
