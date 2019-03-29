package DigitalClock;

	public class ShowTime {
		Time timeMethods = new Time();

		  public static void main(String[] args) {

		    ShowTime objTime = new ShowTime();

		    while (true) {
		      objTime.getTime();
		      try {
		        Thread.sleep(1000);
		      } catch (InterruptedException e) {

		      }
		    }
		  }

		  public void getTime() {

		    long totalMiliSeconds = System.currentTimeMillis();

		    long totalSeconds = totalMiliSeconds / 1000;

		    long seconds = totalSeconds % 60;

		    long totalMinuts = totalSeconds / 60;

		    long minuts = totalMinuts % 60;

		    long totalHours = totalMinuts / 60;
		    long hour = totalHours % 24 + 2;

		    int digitHourLeft = (int) (hour / 10);
		    int digitHourRight = (int) (hour % 10);

		    String[] ArrayHoursLeft = timeMethods.convertString(digitHourLeft);
		    String[] ArrayHoursRight = timeMethods.convertString(digitHourRight);

		    int digitMinutsLeft = (int) (minuts / 10);
		    int digitMinutsRight = (int) (minuts % 10);

		    String[] ArrayDigitMinutsLeft = timeMethods.convertString(digitMinutsLeft);
		    String[] ArrayDigitMinutsRight = timeMethods.convertString(digitMinutsRight);

		    int digitSecondLeft = (int) (seconds / 10);
		    int digitSecondRight = (int) (seconds % 10);

		    String[] ArrayDigitSecondsLeft = timeMethods.convertString(digitSecondLeft);
		    String[] ArrayDigitSecondsRight = timeMethods.convertString(digitSecondRight);

		    String[] point = timeMethods.pointsString();

		    for (int i = 0; i < 3; i++) {
		      System.out.println(ArrayHoursLeft[i] + ArrayHoursRight[i] //
		        + point[i] + ArrayDigitMinutsLeft[i] + ArrayDigitMinutsRight[i] //
		        + point[i] + ArrayDigitSecondsLeft[i] + ArrayDigitSecondsRight[i]);

		    }

		    return;
		  }

		}

		  