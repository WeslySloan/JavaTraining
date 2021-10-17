package score;

import java.util.ArrayList;
import java.util.Iterator;

public class Score {
	ArrayList<Double> scores = new ArrayList<Double>();
	
	public Score() {
		// ???
	}
	
	public void add(double score) {
		scores.add(score);
	}
	
	public double max() {
		double max = 0;
		
		for (double score : scores) {
			if (score > max) {
				max = score;
			}
		}
		
		return max;
	}
	
	public double mean() {
		double sum = 0;
		
		Iterator<Double> iter = scores.iterator();
		
		while (iter.hasNext()) {
			double score = (double) iter.next();
			sum += score;
		}
		
		double mean = sum / scores.size();
		return mean;
	}

}








