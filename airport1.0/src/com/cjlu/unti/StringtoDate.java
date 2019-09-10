package com.cjlu.unti;

public class StringtoDate {
    public static String change(String strA){
    	
    	String strB = "";
    	String[] arrayA = strA.split("/");
       
        
        	strB = strB + arrayA[2]+"-"+arrayA[0]+"-"+arrayA[1];
        	
        
		return strB;
    	
    }
}
