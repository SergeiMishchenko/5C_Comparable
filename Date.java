/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }
    public int compareTo( Object otherObj){		
		if (otherObj instanceof Date){
			Date otherObjCopy = (Date)otherObj ;
			return compare( otherObjCopy);
		}
			
        return 0; // temp: all Points are One
    }
	
	private int compare (Date otherDate){
		if (otherDate.y == y) {
			if (otherDate.m == m){
				if (otherDate.d == d) return 0;
				if (otherDate.d < d) return -1;
				if (otherDate.d > d) return 1;
			}
			else if (otherDate.m < m) return -1;
			else if (otherDate.m > m) return 1;
		}
	    else if (otherDate.y < y) return -1;
		return 1;
	}
}