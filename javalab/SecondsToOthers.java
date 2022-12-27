public class SecondsToOthers
{
public static void main(String[] arg){
int givenSeconds = 13445;
int seconds = givenSeconds%60;
int hour = givenSeconds/60;
int minutes = hour%60;
hour = hour/60;
System.out.println(hour + "hour: " + minutes + "minutes:" + seconds+"seconds");
System.out.println("Sami Gautam");
}
}