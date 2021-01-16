package dom.principles.inheritance;

//Sub Class: Class inherits from the supper class is known as the sub class
//Derived class
public class MountainBike extends Bicycle {

	protected int seatHight;
	
	public MountainBike(int gear, int speed, int seatHight) {
		super(gear, speed);
		this.seatHight = seatHight;
	}

	public void setSeatHight(int seatHight) {
		this.seatHight = seatHight;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Seat hight is " + seatHight;
	}
	

}
