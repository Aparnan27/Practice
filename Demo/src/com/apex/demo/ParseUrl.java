package com.apex.demo;

import java.util.HashMap;

public class ParseUrl {
	
	static String getProtocol(String url) 
	{
		String temp[] = url.split(":");
		if(!temp[0].equals("http") && !temp[0].equals("https"))
		{
			System.out.println("Invalid");
		}
		return temp[0];
		
	}
	
	static String getDomain(String url)
	{
		String temp[] = url.split("/");
		if(!temp[2].equals("www.[a-zA-Z0-9].[a-zA-Z]"))
			System.out.println("Invalid domain name");
		return temp[2];
	}
	
	static String getResource(String url)
	{
		String temp[] = url.split("/");
		String temp_final[] = temp[3].split("\\?");
		
		return temp_final[0];
	}
	static HashMap getParameters(String url) {
		
		HashMap<String,String> temp1 = new HashMap<String,String>();
		String temp[] = url.split("\\?");
		
	
	
		String temp2[] = temp[1].split("&");
		
		for(int i=0;i<temp2.length;i++) {
			
			String temp3[]=temp2[i].split("=");
			temp1.put(temp3[0], temp3[1]);
		}
		
		return temp1;
		
	}
	
	static void parseTheUrl(String parse_url)
	{
		try {
		String protocol = getProtocol(parse_url);
		String domain = getDomain(parse_url);
		String resource = getResource(parse_url);
		HashMap<String,String> parameters = new HashMap<String, String>();
		parameters = getParameters(parse_url);
		
		System.out.println("Protocol: "+protocol);
		System.out.println("Domain: "+domain);
		System.out.println("Resource: "+resource);
		System.out.println("Parameters: "+parameters);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://www.aparna.com/index.php?kannada=100&science=99&english=100&math=50";
		
		parseTheUrl(url);

	}

}
