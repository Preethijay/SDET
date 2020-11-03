
import java.util.*;
import java.util.Date;
import java.util.List;


class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    public Plane(int maxpassengers) {
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<>();
    }
    
    public void onboard(String passenger) {
    	this.passengers.add(passenger);
    }
    
    public Date takeOff() {
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    
    public void land() {
    	this.lastTimeLanded = new Date();
    	this.passengers.clear();
    }
    
    public Date getLastTimeLanded() {
    	
    	return lastTimeLanded;
    }
    
    public List<String> getPassengers() {
    	return passengers;
    }
}

public class Activity2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   Plane plane = new Plane(10);
   plane.onboard("Jane");
   plane.onboard("Mary");
   plane.onboard("Hina");
   
   System.out.println("Time of take off " +plane.takeOff());
   
   System.out.println("Passengers in the plane " +plane.getPassengers());
   Thread.sleep(5000);
   
   plane.land();
   
   System.out.println("Plane is landed " +plane.getLastTimeLanded());
   System.out.println("People on the plane " +plane.getPassengers());
   
	}

}
