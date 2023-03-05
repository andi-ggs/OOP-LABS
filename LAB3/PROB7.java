package LAB3;

class ClockTime {
	public int hour;
	public int minute;
	
	public ClockTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public int compareTime(ClockTime time) {
		int diff1 = 0;
		int diff2 = 0;
		
		if(time.minute > minute) {
			diff1 = time.minute - minute;
			//System.out.println("parametrul - minute e mai mare\n");
		}
		if(time.minute < minute) {
			diff1 = minute - time.minute;
			//System.out.println("parametrul - minute e mai mic\n");
		}
		
		if(time.hour > hour) {
			diff2 = time.hour - hour;
			//System.out.println("parametrul - ore e mai mare\n");
		}
		
		if(time.hour < hour) {
			diff2 = hour - time.hour;
			//System.out.println("parametrul - ore e mai mic\n");
		}
		
		return diff1;
	}
	
	public String toString() {
		return hour + " : " + minute;
	}
}

class Schedule {
	
	ClockTime departure;
	ClockTime arrival;
	
	public Schedule(ClockTime departure, ClockTime arrival) {
		this.departure = departure;
		this.arrival = arrival;
	}
	
	public int durationJourney() {
		int hoursdep = departure.hour*60;
		int hoursarr = arrival.hour*60;
		int duration = 0;
		duration = (hoursarr - hoursdep) + (arrival.minute - departure.minute);
		return duration;
	}
}

class Route {
	String origin;
	String destination;
	
	public Route(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}
	
	public boolean checkRetun(Route second) {
		if((second.origin == second.destination) && (destination == origin))
				return true;
		return false;
	}
}

class Train {
	Route r;
	Schedule s;
	boolean local;
	
	public Train(Route r, Schedule s, boolean local) {
		this.r = r;
		this.s = s;
		this.local = local;
	}
	
	public int ticketPrice() {
		int x = 0;
		if(local == true)
		   x = 1;
		else 
			x = 2;
		//System.out.println(s.departure);
		int price = 0;
		price = x*s.durationJourney();
		return price;
	}
	
	public String toString() {
		return local + " " + r.origin + " " + "(" + s.departure + ")" + " -> " + r.destination + " " + "(" + s.arrival + ")";
	}
}

public class PROB7 {
	
	public static void main(String args[]) {
	
	ClockTime time1 = new ClockTime(9, 35);
	int result;
	ClockTime time2 = new ClockTime(12, 02);
	result = time1.compareTime(time2);
	System.out.println(result);
	
	Schedule s = new Schedule(time1, time2);
	System.out.println(s.durationJourney());
	
	Route route1 = new Route("Bucuresti Nord", "Constanta");
	Route route2 = new Route("Bucuresti", "Bucuresti");
	System.out.println(route1.checkRetun(route2));
	
	Train interregio = new Train(route1, s, false);
	System.out.println(interregio);
	System.out.println(interregio.ticketPrice());
	
	
	
	}
}
