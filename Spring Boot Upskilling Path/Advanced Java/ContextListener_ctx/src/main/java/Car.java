import java.io.Serializable;

public class Car implements Serializable{
	
	public String Reg_No;
	public String make;
	
	public Car() {
		Reg_No = "Unknown";
		make = "Unknown";
	}

	public Car(String reg_No, String make) {
		Reg_No = reg_No;
		this.make = make;
	}
	
	
	
}
