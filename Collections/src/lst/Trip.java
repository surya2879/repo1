package lst;

public class Trip {
double fare;
double distance;
String src,dest;

public Trip(double fare, double distance, String src, String dest) {
	super();
	this.fare = fare;
	this.distance = distance;
	this.src = src;
	this.dest = dest;
}
@Override
	public String toString() {
		
		return this.src+ " to  "+ this.dest + " "+ this.distance +"kms" +" amount is:---> "+ this.fare;
	}

}
