package sortingRace;
import java.util.*;

public class RatingComparator implements Comparator<Recipie> {
	    @Override
	    public int compare(Recipie r1, Recipie r2) {
	    	if (r1.getRating() == r2.getRating())
	    		return 0;
	    	else if (r1.getRating() > r2.getRating())
	    		return 1;
	    	else
	    		return -1;
	    }
	}
