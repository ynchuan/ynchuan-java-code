package Factory_simple;

public class Carfactory implements VehicleFactory {

	@Override
	public Moveable create() {
		Moveable  m=new Car();
		return m;
	}



}
