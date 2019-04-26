package Starter.FactoryStuff;

public class RegistrationPlate {
    public final int width = 20;
    public final int height = 8;
    private String registrationNo; 
    
    RegistrationPlate (String regNo) {
    	registrationNo = regNo;
    }

	public String getRegistrationNo() {
		// TODO Auto-generated method stub
		return registrationNo;
	}
    
}
