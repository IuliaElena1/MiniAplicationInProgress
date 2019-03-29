package digitalClock;

public class Time {
	 public String[] oneString() {
		    String[] one = new String[3];

		    one[0] = "     ";
		    one[1] = "  |  ";
		    one[2] = "  |  ";

		    return one;
		  }

		  private String[] twoString() {
		    String[] two = new String[3];
		    two[0] = "  _  ";
		    two[1] = "  _| ";
		    two[2] = " |_  ";

		    return two;
		  }

		  public String[] threeString() {
		    String[] three = new String[3];
		    three[0] = " _  ";
		    three[1] = " _| ";
		    three[2] = " _| ";

		    return three;
		  }

		  public String[] fourString() {
		    String[] four = new String[3];
		    four[0] = "    ";
		    four[1] = "|_  ";
		    four[2] = "  | ";

		    return four;

		  }

		  public String[] fiveString() {

		    String[] five = new String[3];
		    five[0] = " _  ";
		    five[1] = "|_  ";
		    five[2] = " _| ";

		    return five;
		  }

		  public String[] sixString() {

		    String[] six = new String[3];
		    six[0] = " _  ";
		    six[1] = "|_  ";
		    six[2] = "|_| ";

		    return six;

		  }

		  public String[] sevenString() {
		    String[] seven = new String[3];
		    seven[0] = " _  ";
		    seven[1] = " _| ";
		    seven[2] = "  | ";

		    return seven;

		  }

		  public String[] eightString() {
		    String[] eight = new String[3];
		    eight[0] = "  _  ";
		    eight[1] = " |_| ";
		    eight[2] = " |_| ";

		    return eight;

		  }

		  public String[] nineString() {
		    String[] nine = new String[3];
		    nine[0] = "  _  ";
		    nine[1] = " |_| ";
		    nine[2] = "  _| ";

		    return nine;

		  }

		  public String[] zeroString() {

		    String[] zero = new String[3];
		    zero[0] = "  _  ";
		    zero[1] = " | | ";
		    zero[2] = " |_| ";

		    return zero;
		  }

		  public String[] pointsString() {
		    String[] points = new String[3];
		    points[0] = "   ";
		    points[1] = " o ";
		    points[2] = " o ";

		    return points;

		  }

		  public String[] convertString(int digital) {

		    switch (digital) {
		      case 1:
		        return oneString();

		      case 2:
		        return twoString();

		      case 3:
		        return threeString();

		      case 4:
		        return fourString();

		      case 5:
		        return fiveString();

		      case 6:
		        return sixString();

		      case 7:
		        return sevenString();

		      case 8:
		        return eightString();

		      case 9:
		        return nineString();

		      case 0:
		        return zeroString();

		      default:
		        return pointsString();

		    }

		  }
		}



