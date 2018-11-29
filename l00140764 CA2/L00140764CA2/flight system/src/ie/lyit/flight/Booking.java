/**
 * Author: Dean Golding
 * Class: Software Implementation
 * Instructor: Maria Boyle
 * Description: Class Employee - Developed for the Flight Booking System
 */

package ie.lyit.flight;
import ie.lyit.flight.Passenger;
import java.util.ArrayList;

public class Booking extends Flight{
	private double totalPrice;
	private Flight inbound;
	private Flight outbound;
	public static int count=1;
	private ArrayList<Passenger> passengers;
	public static void main(String[] args) {
	
	}
public Booking() {
	outbound = new Flight();
	outbound = new Flight();
	totalPrice=0;
	count++;
	passengers= new ArrayList<Passenger>();
	 }

public Booking(Flight oF, Flight iF, ArrayList<Passenger> p) {
	outbound=oF;
	inbound=iF;
	passengers=p;
	totalPrice=0;
	count=1;
}
@Override
public String toString() {
	return "Booking [totalPrice=" + totalPrice + ", inbound=" + inbound + ", outbound=" + outbound + "]";
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
public Flight getInbound() {
	return inbound;
}
public void setInbound(Flight inbound) {
	this.inbound = inbound;
}
public Flight getOutbound() {
	return outbound;
}
public void setOutbound(Flight outbound) {
	this.outbound = outbound;
}
public static int getCount() {
	return count;
}

public ArrayList<Passenger> getPassengers() {
	return passengers;
}
public void setPassengers(ArrayList<Passenger> passengers) {
	this.passengers = passengers;
}
public boolean findPassenger(Passenger p) {
	if (passengers.contains(p))
		return true;
	else
		return false;
}
public double calculatePrice() {
	return totalPrice=(outbound.getPrice()+inbound.getPrice())*passengers.size();
}

public boolean equals(Object obj) {
	Booking bTest;
	if(obj instanceof Booking) {
		bTest=(Booking)obj;
		if(bTest.getInbound()==inbound && bTest.getOutbound() == outbound && bTest.getPassengers()==passengers 
		&& bTest.getTotalPrice() == totalPrice) {
			return true;
		}
	}
	else 
		return false;
	return false;
}

}