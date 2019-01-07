interface V1{
	 int hj=89;
	 final int b=4;
}

interface Vehicle{
	final int a=10;
	void changeGear(int a);
	void speed(int a);
	void brakes(int a);
}

class Auto implements Vehicle,V1{
	int gear=0;
	int speed=0;
	public void changeGear(int gear){
		this.gear=b;
	}
    public void speed(int speed){
		this.speed+=speed;
	}
    public void brakes(int speed){
		this.speed-=speed;
	}
	public void printData() {
        System.out.println("Speed: "+this.speed+", Gear: "+this.gear);
    }
}

class Bike implements Vehicle{
	int gear;
	int speed;
	public void changeGear(int gear){
		this.gear=gear;
	}
    public void speed(int speed){
		this.speed+=speed;
	}
    public void brakes(int speed){
		this.speed-=speed;
	}
	public void printData() {
        System.out.println("Speed: "+this.speed+", Gear: "+this.gear);
    }
}

class Interface{
	public static void main (String[] args) {
        V1 v = new Auto();
        Auto auto = new Auto();
        auto.changeGear(2);
        auto.speed(3);
        auto.brakes(1);
	System.out.println("Auto present data :");
        auto.printData();

        Bike bike=new Bike();
        bike.changeGear(1);
        bike.speed(3);
        bike.brakes(1);
	System.out.println("Auto present data :");
        bike.printData();
	}
}

