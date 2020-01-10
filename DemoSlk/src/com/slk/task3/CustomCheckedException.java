package com.slk.task3;

public class CustomCheckedException{
	
	public  Customer findByName(String name) throws NameNotFoundException

	{

        if ("".equals(name)) {
            throw new NameNotFoundException("Name is empty!");
        }

        return new Customer();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CustomCheckedException obj = new CustomCheckedException();

	        try {

	            Customer cus = obj.findByName("");

	        } catch (NameNotFoundException e) {
	            e.printStackTrace();
	        }
	}

}
