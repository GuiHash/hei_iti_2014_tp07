package hei.tp07.entity;

public class Slide {
	
	int indexv;
	int indexf;
	int indexh;
	
	public Slide(int indexv, int indexf, int indexh) {
		super();
		this.indexv = indexv;
		this.indexf = indexf;
		this.indexh = indexh;
	}
	
	public Slide() {
		
	}

	public int getIndexv() {
		return indexv;
	}

	public void setIndexv(int indexv) {
		this.indexv = indexv;
	}

	public int getIndexf() {
		return indexf;
	}

	public void setIndexf(int indexf) {
		this.indexf = indexf;
	}

	public int getIndexh() {
		return indexh;
	}

	public void setIndexh(int indexh) {
		this.indexh = indexh;
	}
	
}
