import java.util.ArrayList;

abstract class Animal{}
interface Hunter{}
class Cat extends Animal implements Hunter{}
class Tiger extends Cat{}

public class Test66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> alTiger = new ArrayList<>();
		alTiger.add(new Tiger());
		ArrayList<Hunter> alHunterCat = new ArrayList<>();
		alHunterCat.add(new Cat());
		ArrayList<Hunter> alHunterTiger = new ArrayList<>();
		alHunterTiger.add(new Tiger());
		ArrayList<Tiger> alTigerCat = new ArrayList<>();
		alTigerCat.add(new Cat());
		ArrayList<Animal> alAnimalCat = new ArrayList<>();
		alAnimalCat.add(new Cat());

	}

}
