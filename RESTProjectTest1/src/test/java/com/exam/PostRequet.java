package com.exam;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;   // Make a static to RestAssured Package


import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class PostRequet{
	
	@Test
	public void GETRequest() {
		baseURI ="https://reqres.in/api";
		given().get("/unknown").then().statusCode(200).body("data[0].id",equalTo(1)).log().all();
		
		
		
		
		
		given().get("/unknown").
		then().statusCode(200).
		body("data[1].name",equalTo("fuchsia rose")).
		body("data[1].id",equalTo(2)).log().all();
		
		
	}

	
	public void GETRequest2() {
		
		baseURI = "https://reqres.in/api";
		
		given().get("/users?page=2").then().statusCode(200).
		body("data.firstname", hasItems("Lindsay", "Tobias")).log().all();
			
	}
	
    public void POSTRequest() {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	JSONObject request = new JSONObject(map);
    	
    	request.put("name", "Monica");
    	request.put("name", "Monica");

    	System.out.println(request.toJSONString());
    	
    	baseURI = "https://reqres.in/api";
    	
    	given().header("Content-Type", "application/json").contentType(ContentType.JSON).
    	accept(ContentType.JSON).body(request.toJSONString()).
    	post("/users").then().statusCode(201).log().all();
    }
	

}


