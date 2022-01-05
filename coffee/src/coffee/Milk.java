package coffee;

public class Milk extends Coffee {
	private Coffee base;
	
	public Milk(Coffee base) {
		this.base = base;
		description = "���� �߰�";
	}
	
	public String getDescription() {
		return this.base.getDescription() + this.description;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.base.cost() + 300;
	}

}
