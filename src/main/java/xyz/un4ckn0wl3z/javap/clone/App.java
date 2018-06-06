package xyz.un4ckn0wl3z.javap.clone;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	
    	if(args.length == 0){
    		return;
    	}
    	
    	
       Class c = Class.forName(args[0]);
       
       System.out.println("Class's Fields.....");
       Field[] fs = c.getDeclaredFields();
       
       for(Field f:fs){
    	   System.out.println(f);  
       }
       
       System.out.println("Class's Constructors........");
       Constructor[] cons=c.getDeclaredConstructors();  
       for(Constructor con:cons){
    	   System.out.println(con);  
       }
       
       System.out.println("Class's Methods........");
       Method m[]=c.getDeclaredMethods();  
       for(int i=0;i<m.length;i++)  
           System.out.println(m[i]);  
      }  
       
       
    
}
