package com.slk.task2.StringHandling;



public class StringClassAllMethods {
	
	
	
    public void stringCharAt() 
    {  
    	String name="javatpoint";  
    	
    	
    	//count String Length is 	
    	int strLength=name.length();
    	System.out.println("Count String length " + strLength) ;
    	
    	//returns char value for the particular index
    	char ch=name.charAt(4);//returns the char value at the 4th index  
    	System.out.println(ch);
    	
    	
    	System.out.println(name.charAt(strLength-2));//return value of  string ride side value
    	
    	
    	
    	//char at index wise value
    	
    	String str=" Hello Tarun Patel ";
    	int count=0;
    	for(int i=0;i<=str.length()-1;i++)
    	{
    		if(i%2!=0)
    		{
    			System.out.println("char At  "+ i+ "  place   " + str.charAt(i));
    		}
    		//count String in a is number of times
    		if(str.charAt(i)=='a')
    		{
    			count++;
    		}
    	
    		
    	}
    	
    	System.out.println("Frequency of a is : "+ count);
    	
    	
    } 
    
    public void staticStringFormat() 
    {  
    	//check a format of string
    	System.out.println("===>> String Format Method");
    	String str1 = String.format("%d", 101);          // Integer value  
        String str2 = String.format("%s", "Tarun Patel"); // String value  
        String str3 = String.format("%f", 101.00);       // Float value  
        String str4 = String.format("%x", 102);          // Hexadecimal value  
        String str5 = String.format("%c", 'T');          // Char value  
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5);  
    } 
    public void javaSubString() 
    {  
    	//this method used returns substring for given begin index.
    	System.out.println("===>> java Sub String  Method");
    	
    	   String s1="Javatpoint";    
           String substr = s1.substring(0); // Starts with 0 and goes to end  
           System.out.println(substr); 
           
           //this method used returns substring for given begin index and end index.
           String substr2 = s1.substring(5,10); // Starts from 5 and goes to 10  
           System.out.println(substr2);    
          // String substr3 = s1.substring(5,15); // Returns Exception    
    } 
    
    public void stringContains() 
    {
    	//	returns true or false after matching the sequence of char value.
    	System.out.println("===>> stringContains()  Method");
    	
    	  String str = "Hello JAvatpoint readers";  
          boolean isContains = str.contains("JAvatpoint");  
          System.out.println(isContains);  
          // Case Sensitive  
          System.out.println(str.contains("javatpoint")); // false 
    }
    public void stringJoin() 
    {
    	//returns a joined string.
    	System.out.println("===>> stringJoin()  Method");
    	
    	  String date =String.join("/","25","12","2019");;  
          System.out.println(date);  
       
    }
    public void stringEquals() 
    {
    	//checks the equality of string with the given object.
    	System.out.println("===>>  stringEquals()   Method");
    	
    	String s1="javatpoint";  
    	String s2="javatpoint";  
    	String s3="JAVATPOINT";  
    	String s4="python";  
    	System.out.println(s1.equals(s2));//true because content and case is same  
    	System.out.println(s1.equals(s3));//false because case is not same  
    	System.out.println(s1.equals(s4));//false because content is not same 
       
    }
    
    public void stringReplace()
    {
    	//re
    	System.out.println("===>>  stringReplace()   Method");
    	
    	String st="My name is Tarun Patel";
    	
    	
    	String stringReplace = st.replace("Tarun", "Lalu");//string replace charSequence 
    	System.out.println(stringReplace);
    	
    	
    	String stringCharSequence = st.replace("t" ,"P");
    	System.out.println(stringCharSequence);
    }
    public void stringIntern()
    {
    	System.out.println("===>>  stringIntern()   Method");
    	
    	String s1 = new String("Tarun");

    	String s2="Tarun";
    	
    	String s3 = s1 .intern();
    	
    	System.out.println(s1 == s2);
    	System.out.println(s2 == s3);
    	System.out.println(s1.hashCode());

    	System.out.println(s2.hashCode());

    	System.out.println(s3.hashCode());
    	
    	
    	
    }
    public void  stringIndexOf()
    {
    	System.out.println("===>>  stringIndexOf()   Method");
    	
    	String s1="this is index of example";  
    	//passing substring  
    	int index1=s1.indexOf("is");//returns the index of is substring  
    	int index2=s1.indexOf("index");//returns the index of index substring  
    	System.out.println(index1+"  "+index2);//2 8  
    	  
    	//passing substring with from index  
    	int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
    	System.out.println(index3);//5 i.e. the index of another is  
    	  
    	//passing char value  
    	int index4=s1.indexOf('s');//returns the index of s char value  
    	System.out.println(index4);//3  
    	
    	
    	int index5 = s1.indexOf("example", 20); // It returns -1 if substring does not found  
         System.out.println("index of substring "+index5);          
    }
    public void stringToLowerCaseAndUparCase()
    {
    	System.out.println("===>>  stringToLowerCaseAndUparCase()   Method");
    	
    	String s1="JAVATPOINT HELLO stRIng";  
    	String s1lower=s1.toLowerCase();  
    	System.out.println(s1lower);  
    	
    	
    	String s2="hello string";  
    	String s1upper=s2.toUpperCase();  
    	System.out.println(s1upper); 
    	
    }
    public void stringTrim()
    {
    	System.out.println("===>>  stringTrim()   Method");
    	
    	String s1="  hello string   ";  
    	System.out.println(s1+"javatpoint");//without trim()  
    	System.out.println(s1.trim()+"javatpoint");//with trim(
    }
    public void stringValueOf()
    {
    	 boolean b1=true;  
         byte b2=11;    
         short sh = 12;  
         int i = 13;  
         long l = 14L;  
         float f = 15.5f;  
         double d = 16.5d;  
         char chr[]={'j','a','v','a'};  
        
         String s1 = String.valueOf(b1);    
         String s2 = String.valueOf(b2);    
         String s3 = String.valueOf(sh);    
         String s4 = String.valueOf(i);    
         String s5 = String.valueOf(l);    
         String s6 = String.valueOf(f);    
         String s7 = String.valueOf(d);    
         String s8 = String.valueOf(chr);    
         System.out.println(s1);  
         System.out.println(s2);  
         System.out.println(s3);  
         System.out.println(s4);  
         System.out.println(s5);  
         System.out.println(s6);  
         System.out.println(s7);  
         System.out.println(s8);  
      }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringClassAllMethods stringClassAllMethods = new StringClassAllMethods();
		stringClassAllMethods.stringCharAt();
		stringClassAllMethods.staticStringFormat();
		stringClassAllMethods.javaSubString();
		stringClassAllMethods.stringContains();
		stringClassAllMethods.stringJoin();
		stringClassAllMethods.stringEquals();
		stringClassAllMethods.stringReplace();
		stringClassAllMethods.stringIntern();
		stringClassAllMethods.stringIndexOf();
		stringClassAllMethods.stringToLowerCaseAndUparCase();
		stringClassAllMethods.stringTrim();
		stringClassAllMethods.stringValueOf();
	}

}
