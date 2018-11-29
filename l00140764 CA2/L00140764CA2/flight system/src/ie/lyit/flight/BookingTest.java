/**
 * Author: Dean Golding
 * Class: Software Implementation
 * Instructor: Maria Boyle
 * Description: Class Employee - Developed for the Flight Booking System
 */
package ie.lyit.flight;
import java.util.ArrayList;

public class BookingTest {
private Booking m2;
private Flight fliteA;
private Flight fliteB;
private Passenger passengerA;
private Passenger passengerB;
ArrayList<Passenger> passengers; 
	
	public void setUp() throws Exception {
	m2 = new Booking();

	fliteA = new Flight("BR215","Derry","Stanstead",25,12,2018,12,40,16.99);
	fliteB = new Flight("BR418","Stanstead","Derry",30,12,2018,10,15,24.99);
	
	passengerA = new Passenger("Ms", "Lisa","Simpson", 20, 12, 1992, 1, true);
	passengerB = new Passenger("MR", "Bart", "Simpson", 20,12,1992,1,true);
	passengers= new ArrayList<Passenger>();
	}
	
	 public void testToString() {
		passengers.add(passengerA);
		m2.setInbound(fliteA);
		m2.setOutbound(fliteB);
		assertTrue(m2.toString().contains(fliteA.toString()));
    	assertTrue(m2.toString().contains(fliteB.toString()));
		
	}
	private void assertTrue(boolean contains) {
		// TODO Auto-generated method stub	
	}
	public void testBookingFlightFlightArrayListOfPassenger() {
		
	}
	public void testSetTotalPrice() {
		
	}
	public void testSetPassengers() {
		passengers.add(passengerA);
		m2.setPassengers(passengers);
		assertEquals("Passengers size",m2.getPassengers().size(),1,0);		
	}
	private void assertEquals(String string, int size, int i, int j) {
		// TODO Auto-generated method stub	
	}
	public void testInbound() {
		m2.setInbound(fliteB);
		assertEquals(m2.getInbound(),fliteB);
	}
    
    private void assertEquals(Passenger passengerA2, Passenger passengerA3) {
		// TODO Auto-generated method stub
		
	}

	public void testsetOutbound() {
    	m2.setOutbound(fliteA);
    	assertEquals(m2.getOutbound(),fliteA);
    }
	private void assertEquals(Flight outbound, Flight fliteA2) {
		// TODO Auto-generated method stub
		
	}

	public void testFindPassenger() {
		assertNotSame(passengerA,passengerB);
		assertEquals(passengerA,passengerA);
	}
	private void assertNotSame(Passenger passengerA2, Passenger passengerB2) {
		// TODO Auto-generated method stub
		
	}
	public void testCalculatePrice() {
		passengers.add(passengerA);
		passengers.add(passengerB);
		m2.setInbound(fliteA);
		m2.setOutbound(fliteB);
		m2.setPassengers(passengers);
		
		//assertTrue(m2.calculatePrice()==41.98);
		assertEquals("blah",m2.calculatePrice(),83.96,0);
	}
	private void assertEquals(String string, double calculatePrice, double d, int j) {
		// TODO Auto-generated method stub
	}

}