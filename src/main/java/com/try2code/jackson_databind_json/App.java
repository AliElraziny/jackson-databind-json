package com.try2code.jackson_databind_json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.try2code.pojo.Driver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ObjectMapper mapper = new ObjectMapper();
        Driver D1 = null , D2=new Driver(14 , "saad" , "ahmed" ,true) ;
        
        try {
			   D1 = mapper.readValue(new File("data/sample-data.json"), Driver.class) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println(D1.getFirstName());
        
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
			mapper.writeValue(new File("data/sample-data.json"), D2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        
    }
}
