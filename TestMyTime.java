package Week2.Day2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(20, 25, 50);
       //  myTime.nextHour();
      //  myTime.nextMinute();
     //  myTime.nextSecond();

        myTime.previosSecond();
        myTime.previosMinute();
        myTime.previosHour();
        System.out.println(myTime);

    }//end
}//end