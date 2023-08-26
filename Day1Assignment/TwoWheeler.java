package Day1Assignment;

public class TwoWheeler {
	int noOfWheels;
	short noOfMirrors;
	long chasisNumber;
	boolean isPunctured;
	String bikeName;
	double runningKM;
	public static void main(String[] args) {
	TwoWheeler bike=new TwoWheeler();
	bike.noOfWheels=1;
	bike.noOfMirrors=2;
	bike.chasisNumber=1234567890L;
	bike.isPunctured=false;
	bike.bikeName="Harley";
	bike.runningKM=70.35;
	System.out.println("Bike Name is:" +bike.bikeName+"\n"+
			           "Number of Wheels:" +bike.noOfWheels+"\n"+
	                   "Number of Mirrors:" +bike.noOfMirrors+"\n"+ 
	                   "Chasis Number:" +bike.chasisNumber+"\n"+
	                   "isPunctured:" +bike.isPunctured+"\n"+
	                   "Running KMs are:" +bike.runningKM);
}
}
