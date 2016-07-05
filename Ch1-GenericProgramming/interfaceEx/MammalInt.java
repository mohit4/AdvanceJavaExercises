//this class implements the Animal Interface
public class MammalInt implements Animal{

	public void eat(){
		System.out.println("Mammal is eating.");
	}

	public void travel(){
		System.out.println("Mammal is travelling.");
	}

	public int noOfLegs(){
		return 4;
	}

	public static void main(String[] args){
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
	}
}
