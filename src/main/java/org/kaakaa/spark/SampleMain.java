package org.kaakaa.spark;

import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class SampleMain implements SparkApplication{
	@Override
	public void init(){
		get("/hello", (req, res) -> "hello");
	}
}
