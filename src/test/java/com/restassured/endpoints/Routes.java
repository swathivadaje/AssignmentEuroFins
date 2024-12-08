package com.restassured.endpoints;

//Get https://petstore.swagger.io/v2/user/{username}
//Post https://petstore.swagger.io/v2/user
//Put https://petstore.swagger.io/v2/user/{username}
//Delete https://petstore.swagger.io/v2/user/{username}
	
	
	
public class Routes {
	public static String base_url= "https://petstore.swagger.io/v2/user";
	public static String post_url= base_url + "/user";
	public static String get_url= base_url + "/user/{username}";
	public static String put_url= base_url + "/user/{username}";
	public static String delete_url= base_url + "/user/{username}";
	
}
