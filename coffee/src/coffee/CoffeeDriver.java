package coffee;

public class CoffeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("주문하세요~");
		
		Coffee coffee = new Americano();
		coffee = new Milk(coffee);
//		coffee = new Mocha(coffee);
		coffee = new Milk(coffee);
		coffee = new Milk(coffee);
		coffee = new Milk(coffee);
		
		System.out.println(coffee.getDescription() + coffee.cost());
	}

}
