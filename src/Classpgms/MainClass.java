package Classpgms;

class SingleDimensionArray {
	int[] arr = null;

	public SingleDimensionArray(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	// SDA insertion
	public void insertion(int location, int value) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = value;
				System.out.println(value + "is succesfuly inserted");
			} else {
				System.out.println("the cell already fill");
			}
		} catch (Exception e) {
			System.out.println("inavalid location");
		}
	}

	// SDA traversal
	public void traversal() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " " + arr[i]);
		}
	}

	// SDA Seraching
	public int searching(int valueToSeacrh) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valueToSeacrh) {
				System.out.println("the value" + valueToSeacrh + " is in the index of" + i);
				return 1;
			}
		}
		return -1;
	}

	// SDA Deletion
	public void deletion(int indexToDelete) {
		try {
			arr[indexToDelete] = Integer.MIN_VALUE;
			System.out.println("the cell is deleted succesfully");
		} catch (Exception e) {
			System.out.println("Invalid Index");
		}
	}
}

public class MainClass {
	public static void main(String[] args) {
		SingleDimensionArray sda = new SingleDimensionArray(5);
		sda.insertion(0, 10);
		sda.insertion(1, 20);
		sda.insertion(2, 30);
		sda.insertion(3, 40);
		sda.insertion(4, 50);
		sda.insertion(1, 70);
		sda.insertion(5, 60);

		sda.traversal();
		sda.searching(4);

		sda.deletion(2);
		System.out.println(".................");
		sda.traversal();
	}
}
