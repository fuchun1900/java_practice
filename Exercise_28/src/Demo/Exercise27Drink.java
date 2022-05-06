package Demo;

public abstract class Exercise27Drink {
	protected static int drinkType;
	
	public abstract void taste();
	public static Exercise27Drink getDrink(int drinkType) throws Exercise27DrinkNotFoundException{
		switch(drinkType) {
		case 1 : 
			return new Exercise27Beer();
		case 2:
			return new Exercise27coffee();
		case 3:
			return new Exercise27Milk();
		default:
			throw new Exercise27DrinkNotFoundException();
		}
	}
}
