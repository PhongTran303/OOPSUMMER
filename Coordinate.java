package baitap;

public class Coordinate {

	    private int x;
	    private int y;
	    private String name;

	    public Coordinate() {
	    }

	    public Coordinate(int x, int y, String name) {
	        this.x = x;
	        this.y = y;
	        this.name = name;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getX() {
	        return x;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    @Override
	    public String toString() {
	        return name + "(" + x + "," + y + ")";
	    }
	    
	}
