package sortingRace;
import java.util.*;

public class DifficultyComparator implements Comparator<Recipie> {
	    @Override
	    public int compare(Recipie r1, Recipie r2) {
	    	if (r1.getDifficulty() == r2.getDifficulty())
	    		return 0;
	    	else if (r1.getDifficulty() > r2.getDifficulty())
	    		return 1;
	    	else
	    		return -1;
	    }
	    }


