package sortingRace;
import java.util.*;

public class ClientCode {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	int cookbookSize = 7;
	
	System.out.println("Please enter the data for " + cookbookSize + " recipies. "
			+ "The computer will then sort them according to your preference.\n");
	
	Recipie[] cookbook = new Recipie[cookbookSize];
	
	for(int i = 0; i < cookbookSize; i++) {
		System.out.println("Recipie #" + (i + 1) + " Title: ");
		String title = input.nextLine();
		System.out.println("Category: ");
		String category = input.nextLine();
		System.out.println("Difficulty (0-5): ");
		int difficulty = input.nextInt();
		System.out.println("Rating (0-5): ");
		int rating = input.nextInt();
		input.nextLine();
		Recipie r = new Recipie(title, category, difficulty, rating);
		cookbook[i] = r;
	}
	
	System.out.println("\nYour cookbook has been filled.");
	
	System.out.println("What would you like to sort your cookbook according to recipie titles, or "
			+ "something else? Press 0 for titles, or 1 for something else");
	int orderBy = input.nextInt();
	
	if(orderBy==0) 
		sortWithComparable(cookbook);
	else
		sortWithComparator(cookbook);
	
	input.close();
	}
	
	public static void sortWithComparable(Recipie[] cookbook) {
		Scanner input = new Scanner(System.in);
	
	System.out.println("How would you like to sort? Press 0 for insertion sort or 1 for bubble sort.");


	
	int sortChoice = input.nextInt();
	
	GenericInsertionSort<Recipie> isort = new GenericInsertionSort<Recipie>(cookbook, null);
	GenericBubbleSort<Recipie> bsort = new GenericBubbleSort<Recipie>(cookbook, null);
	
	if (sortChoice == 0) 
		isort.insertionSortWithComparable();
	else
		bsort.bubbleSortWithComparable();
	
	
	System.out.println("We will print according to Name: ");
	for (Recipie r: cookbook) {
		System.out.println(r.getWhenSortedByName());
	}

	input.close();
	}

	public static void sortWithComparator(Recipie[] cookbook) {
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to organize your recipies according to? Enter 0 for category,"
				+ " 1 for difficulty, or 2 for rating: ");
		
		int sortChoice = input.nextInt();
		
		Comparator comp;
		
		if(sortChoice ==0) {
			comp = new CategoryComparator();
		}
		else if(sortChoice ==1) {
			comp = new DifficultyComparator();
		}
		else
			comp = new RatingComparator();
		
		
		GenericInsertionSort<Recipie> isort = new GenericInsertionSort<Recipie>(cookbook, comp);
		GenericBubbleSort<Recipie> bsort = new GenericBubbleSort<Recipie>(cookbook, comp);
		
		System.out.println("How would you like to sort? Press 0 for insertion sort or 1 for bubble sort.");
		
		int methodSort = input.nextInt();
		if (methodSort == 0) 
			isort.insertionSortWithComparator();
		else
			bsort.bubbleSortWithComparator();
		
		if(sortChoice ==0) {
		System.out.println("We will print according to Category: ");
		for (Recipie r: cookbook) {
			System.out.println(r.getWhenSortedByCategory());
		}
		}
		else if(sortChoice==1) {
			System.out.println("We will print according to Diffculty: ");
			for (Recipie r: cookbook) {
				System.out.println(r.getWhenSortedByDifficulty());
			}	
		}
		else {
			System.out.println("We will print according to Rating: ");
			for (Recipie r: cookbook) {
				System.out.println(r.getWhenSortedByRating());
			}
		}
			
		input.close();
		
	}
	
	}

