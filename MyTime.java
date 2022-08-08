package Week2.Day2;

public class MyTime  {

    int hour=0;
    int minute=0;
    int second=0;

    public MyTime(){

    }

    public MyTime(int hour , int minute ,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public void setTime(int hour,int minute,int second) {

       if ( hour <= 24  && hour > 0) {
          setHour(hour);
      }
       if ( minute <= 60  && minute > 0) {
            setMinute(minute);

      } if ( second <= 60  && second > 0) {
          setSecond(second);
       }
        else {
            throw new IllegalArgumentException("invalid hour , min ,sec");
      }
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "MyTime" +" " + hour + ":" + minute + ":" + second ;
    }


    public MyTime nextSecond(){
        if(second==59){
            this.second=second;
            nextMinute();
        } else {
            this.second++;
        }
        return this;
    }

    public MyTime nextMinute(){
        if(minute==59){
            this. minute=minute;
            nextHour();
        } else {
            this.minute++;
        }
        return this;
    }

    public MyTime nextHour(){
        if(hour==59){
            this. hour=minute;
        } else {
            this.hour++;
        }
        return this;
    }
    public MyTime previosSecond(){
        if(second==59){
            this.second=second;
            previosMinute();
        } else {
            this.second--;
        }
        return this;
    }

    public MyTime previosMinute(){
        if(minute==59){
            this. minute=minute;
            previosHour();
        } else {
            this.minute--;
        }
        return this;
    }

    public MyTime previosHour(){
        if(hour==59){
            this. hour=minute;
        } else {
            this.hour--;
        }
        return this;
    }

}//
