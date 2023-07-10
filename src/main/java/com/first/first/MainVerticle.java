package com.first.first;

import com.first.first.firstV.FirstVerticle;

import io.vertx.core.Vertx;

/*public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    
}
}*/

public class MainVerticle {
	public static void main(String[] args) {
		
		
		Vertx vertx = Vertx.vertx();
		
		
		FirstVerticle fv = new FirstVerticle();
		vertx.deployVerticle(fv);
		
	}
}