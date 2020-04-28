
public class BusRoute {
	
	private BusLine Line;
	private double DepartureTime;
	private int currPassengers;
	private int totalPassengers;
	private Bus bus;
	
	public BusRoute(BusLine Line,double DepartureTime, Bus bus) {
		
		this.Line = Line;
		this.DepartureTime = DepartureTime;
		this.currPassengers = 0;
		this.totalPassengers = 0;
		this.bus=bus;
	}
	
	public void addPassenger() {
		
		if(currPassengers<bus.getCapacity()) {
			
			currPassengers ++;
			totalPassengers ++;
		}
			
	}
	
	public void setNumOfPassengers(int passengers) {
		
		if(passengers<bus.getCapacity())
			this.currPassengers = passengers;
			this.totalPassengers += passengers;
	}
	

	public BusLine getLine() {
		
		return Line;
	}
	
	public double getDepartureTime() {
		
		return DepartureTime;
	}
	
	public int getCurrNumOfPassengers() {
		
		return currPassengers;
	}
	
	public int getTotalPassenger() {
		
		return totalPassengers;
	}
	public void removePassenger() {
		currPassengers --;
	}
	
}