package cooperatation;

public class TakeTrans {

	public static void main(String[] args) {
		Student james = new Student("James",5000);
		Student tomas = new Student("Tomas",10000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwyGreen = new Subway(2);
		tomas.takeSubway(subwyGreen);
		tomas.showInfo();
		subwyGreen.showInfo();
		
	}

}
