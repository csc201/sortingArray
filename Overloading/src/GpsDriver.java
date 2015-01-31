
public class GpsDriver {
	public static void main(String [] args) {
		int speed = 60;//SpeedoMeterSensor.getSpeed();
		Gps gps = new Gps();
		double x = 1.20002;
		System.out.println(gps.getDirection());
		System.out.println(gps.getDirection("Nova"));
		System.out.println(Direction.EAST.getX()); //5
		System.out.println(Direction.EAST.getY()); //0
		System.out.printf("The number is %.2f", x);
	}
}
