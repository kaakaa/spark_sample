package org.kaakaa.spark;

import static spark.Spark.*;

class SampleMain {
	public static void main(String[] args) {
		get("/hello", (req, res) -> "hello");
	}
}
