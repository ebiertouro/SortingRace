package sortingRace;


public class Recipie implements Comparable<Recipie>{
	
	String title;
	int difficulty;
	int rating;
	String category;
	
	public Recipie(String t, String c, int d, int r){
		title = t;
		category = c;
		difficulty = d;
		rating = r;
	}
	
	 public int compareTo(Recipie r) {
		 return this.title.compareTo(r.title);
	 }
	 
	 public int getRating() {
		 return rating;
	 }
	 
	 public int getDifficulty() {
		 return difficulty;
	 }
	 
	 public String getCategory() {
		 return category;
	 }
	 public String getWhenSortedByName() {
		 String str = "Title: " + title + ", Category: " + category + ", Difficulty: " + 
	 difficulty + ", Rating: " + rating;
		 return str;
	 }
	 
	 public String getWhenSortedByCategory() {
		 String str = "Category: " + category +", Title: " + title +  ", Difficulty: " + 
	 difficulty + ", Rating: " + rating;
		 return str;
	 }
	 
	 public String getWhenSortedByDifficulty() {
		 String str = "Difficulty: " +  difficulty + ", Title: " + title +
				 ", Category: " + category + ", Rating: " + rating;
		 return str;
	 }
	 
	 public String getWhenSortedByRating() {
		 String str = "Rating: " + rating+ ", Title: " + title + ", Category: " 
	 + category + ", Difficulty: " + difficulty;
		 return str;
	 }
	
}

