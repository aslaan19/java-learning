import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Container> containers = new ArrayList<>();

		System.out.print("Enter the number of objects: ");
		int numObjects = sc.nextInt();

		int[] objectWeights = new int[numObjects];
		System.out.print("Enter the weights of the objects: ");
		for (int i = 0; i < numObjects; i++) {
			objectWeights[i] = sc.nextInt();
		}

		for (int weight : objectWeights) {
			boolean added = false;
			for (Container container : containers) {
				if (container.addItem(weight)) {
					added = true;
					break;
				}
			}

			if (!added) {
				Container newContainer = new Container();
				newContainer.addItem(weight);
				containers.add(newContainer);
			}
		}

		System.out.println("Total number of containers needed: " + containers.size());
		for (int i = 0; i < containers.size(); i++) {
			System.out.println("Container " + i + " contains objects with weights " + containers.get(i).getItems());
		}
	}
}
