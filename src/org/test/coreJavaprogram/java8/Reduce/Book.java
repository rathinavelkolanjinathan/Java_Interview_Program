package org.test.coreJavaprogram.java8.Reduce;

public class Book {
	String bname;
	double bprice;
	long bpage;
	int nbook;

	public Book(String bname, double bprice, long bpage, int nbook) {
		this.bname = bname;
		this.bprice = bprice;
		this.bpage = bpage;
		this.nbook = nbook;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(double bprice) {
		this.bprice = bprice;
	}

	public long getBpage() {
		return bpage;
	}

	public void setBpage(long bpage) {
		this.bpage = bpage;
	}

	public int getNbook() {
		return nbook;
	}

	public void setNbook(int nbook) {
		this.nbook = nbook;
	}

}
