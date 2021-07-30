package com.maps;

import java.util.HashMap;

public class HashMaps {
	
	public static HashMap<String, String> getUserLogin() throws InterruptedException{
		HashMap<String, String> usermap = new HashMap<String, String>();
		usermap.put("employee", "geo@mailinator.com_Abc12345");
		return usermap;
	}
	
	public static HashMap<String, String> getManager(){
		HashMap<String, String> usermap1 = new HashMap<String, String>();
		usermap1.put("manager", "ameya.joshi@gipl.com_Abc12345");
		return usermap1;
	}
	
	public static HashMap<String, String> getSupervisor(){
		HashMap<String, String> usermap2 = new HashMap<String, String>();
		usermap2.put("supervisor", "vaibhav@gipl.com_Abc12345");
		return usermap2;
	}
	public static HashMap<String, String> getAdmin(){
		HashMap<String, String> usermap3 = new HashMap<String, String>();
	
		usermap3.put("admin" , "avinash@gipl.com_Abc12345");
	
		
		return usermap3;
	
	}

}
