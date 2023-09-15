import java.util.*;

public class HW2 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(); // making the arraylist and adding the variables to it
		numbers.add(18);
		numbers.add(10);
		numbers.add(7);
		numbers.add(2);
		numbers.add(4);
		numbers.add(4);

		int Subtracted = 0;
		for (int j = 0; !(checkOrder(numbers)); j++) {
			System.out.println(numbers);

			for (int i = 0; i < (numbers.size()); i++) {

				int num = numbers.get(i);
				// Subtract 1 from each element
				numbers.set(i, num - 1);
				Subtracted += 1; // for getting the sum of the sumstraction

				if (numbers.get(i) == 0) {// remove the element when it becomes zero
					numbers.remove(i);

					i--;

				}
			}
			numbers.add(Subtracted); // add the sum of the subtracted numbers
			Subtracted = 0;

		}

		System.out.println(numbers);

	}

	public static boolean checkOrder(ArrayList<Integer> list) {// this function is to check if the arraylist is in the
																// targeted form or not
		boolean orderd = false;
		int order = 0;
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) == i + 1) {

				order += 1;

			}
		}
		if (order == list.size()) {
			orderd = true;
		}
		return orderd;

	}

}