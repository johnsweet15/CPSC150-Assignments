import java.util.*;

public class Car {

	private String make;
	private String model;
	private int year;
	private int passengers;
	
	public Car(){
		make = "None";
		model = "None";
		year = 2015;
		passengers = 4;
	}
	
	public Car(String make, String model, int year, int passengers){
		this.make = make;
		this.model = model;
		this.year = year;
		this.passengers = passengers;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public String getMake(){
		return make;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setPassengers(int passengers){
		this.passengers = passengers;
	}
	
	public int getPassengers(){
		return passengers;
	}
	
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the car make: ");
	}
}
