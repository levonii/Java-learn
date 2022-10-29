package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        String strDate,strTime;
        Date objDate = new Date();
        System.out.println(objDate);

        long time = objDate.getTime();
        System.out.println(time);
        strDate = objDate.toString();
        strTime = strDate.substring(11,(strDate.length()-4));
        //strTime = "时间："+strTime.substring(0,strDate.length());
        System.out.println(strTime);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(objDate));
    }
}
