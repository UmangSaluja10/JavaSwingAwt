import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.util.Date;

// Timer = A facility for threads to schedule tasks for future execution in a background thread;
// TimerTask = A task that can be scheduled for one-time or repeated execution by a Timer.
public class timerTask
{
    public static void main(String args[]){
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int counter= 10;
            @Override
            public void run(){
                if(counter>0){
                    System.out.println(counter+" seconds");
                    counter--;
                }
                else{
                    System.out.println("Happy Birthday!!");
                    timer.cancel();
                }
            }
        };
        //timer.schedule(task,3000);     //task,delay
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2025);
        date.set(Calendar.MONTH, Calendar.JULY);
        date.set(Calendar.DAY_OF_MONTH,5);
        date.set(Calendar.HOUR_OF_DAY,2);
        date.set(Calendar.MINUTE,31);
        date.set(Calendar.SECOND,50);
        //timer.schedule(task, date.getTime());
        //timer.scheduleAtFixedRate(task,0,1000);
        timer.scheduleAtFixedRate(task,date.getTime(),1000);
    }
}
