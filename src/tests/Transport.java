package tests;


public class Transport {
	String type;

	Transport() {
		this.type = "Land Transport";
	}
	
	Transport (String type){
		this.type = type;
	}
	

}

class Car extends Transport {
	String model;

	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String type) {
		super(type);
		this.model = model;
	}
}

class Test {
	public static void main(String[] args) {
		Transport car = new Car("Audi", "Car type transport");
		System.out.println(car.type);
		System.out.println(((Car)car).model);
	}
}

