package HouseConstruction;
import java.util.*;

public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Want to construct house......? ");
		System.out.format("%s","Available material standards are standard,above standard,high standar,high standard and fully automated");
		System.out.format("%s", "what type of materials do you want to construct your house:" );
		String material = sc.nextLine();
		float no_of_square_feet =sc.nextFloat();
		ConstructionCost obj = new ConstructionCost();
		float Total_Cost = obj.calculateConstructionCost(material,no_of_square_feet);
		System.out.format("%s","Total Construction cost is ");
		System.out.format("%f",Total_Cost);
		
	}

}
