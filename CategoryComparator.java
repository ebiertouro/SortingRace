package sortingRace;
import java.util.*;

public class CategoryComparator implements Comparator<Recipie> {
	    @Override
	    public int compare(Recipie r1, Recipie r2) {
	        return r1.getCategory().compareTo(r2.getCategory());
	    }
	}
