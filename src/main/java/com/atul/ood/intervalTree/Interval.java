package com.atul.ood.intervalTree;

public class Interval<T> implements Comparable<Interval> {
	private double  low;   // the left endpoint
	private double  high;  // the right endpoint
	private boolean lopen; // indicates if the left endpoint is excluded
	private boolean ropen; // indicates if the right endpoint is excluded
	private T       value; // the value stored in this interval
	@Override
	public int compareTo(Interval o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
