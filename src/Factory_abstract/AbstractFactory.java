package Factory_abstract;

public interface AbstractFactory {
	Moveable createMoveable();
	Weapen   createWeapen();
	Food  createFood();
}
