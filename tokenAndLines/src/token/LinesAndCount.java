package token;

import java.util.Collection;
import java.util.TreeSet;

public class LinesAndCount {
	private int count = 0;
	Collection<Integer> lines = new TreeSet<Integer>();
	
	public LinesAndCount() {
		
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public TreeSet<Integer> getLines() {
		return (TreeSet) lines;
	}

	public void setLines(TreeSet<Integer> lines) {
		this.lines = lines;
	}
}
