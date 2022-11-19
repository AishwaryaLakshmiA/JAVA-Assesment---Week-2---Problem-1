package Prob1;

import java.util.List;

public class Point {
	
	private int val;

	public Point(int val) {
		super();
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		if(val==0)
			this.val=12;
		else
			this.val = val;
	}

	@Override
	public String toString() {
		return "Point [val=" + val + "]";
	}
	
	public boolean checkPoint()
	{
		if(this.val>=1&&this.val<=12)
			return true;
		return false;
	}
}
