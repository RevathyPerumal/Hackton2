package com.cucumber.utils;

public class ZipcodeData {
	
	 private static String emailid;
	 private static String firstname;
	    private  static String lastname;	   
	    private static String address;
	    private static String city;
	    private static String postalcode;
	    private static String phone;
	   

		public ZipcodeData() {

			// Reading data from Excel
			ReadExcelFile file;
			try {
				file = new ReadExcelFile();
				
				Object[][] data = file.ReadExcelFile("C:\\Users\\Lenovo\\Downloads\\Cucumber_Group_Assessment\\Cucumber_Group_Assessment\\ExcelData",
						"ExcelData.xlsx", "Sheet3");

				// Assigning values to the data read from excel
				 emailid = data[1][0].toString();
				 firstname = data[1][1].toString();
			     lastname = data[1][2].toString();
			    address = data[1][3].toString();
			    city = data[1][4].toString();
			    postalcode = data[1][5].toString();
			    phone = data[1][6].toString();
			
			  
						

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		// methods for every variable
		
		public String email() {
	    	 return emailid;
	    	 
	     }
		  public String fname() {
				return firstname;
				
			}
		 

		    public  String lname() {
		        return lastname;
		    }
		     
		     public String add() {
		    	 return address;
		     }
		    public String citys() {
		    	return city;
		    	
		    }
		    public String zip() {
		    	return postalcode;
		    }
		    public String phonenum() {
		    	return phone;
		    }
		  



}
