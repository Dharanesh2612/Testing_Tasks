package com.exam;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;   // Make a static to RestAssured Package


import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;




public class PutPatch {
	//@Test
       public void Putreuest() {
    	   JSONObject request = new JSONObject();
    	   request.put("name", "Monica");
       	request.put("name", "Monica");
       	System.out.println(request.toJSONString());
       	
       	
         baseURI = "https://reqres.in/api";
    	
    	given().header("Content-Type", "application/json").contentType(ContentType.JSON).
    	accept(ContentType.JSON).body(request.toJSONString()).
    	post("/users/2").then().statusCode(201).log().all();
     }
	@Test
	
   public void DeleteRequest() {
	   baseURI = "https://reqres.in";
	   when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
   }
}
