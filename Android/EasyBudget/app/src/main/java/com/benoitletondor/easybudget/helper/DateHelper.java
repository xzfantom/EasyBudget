package com.benoitletondor.easybudget.helper;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Benoit LETONDOR
 */
public class DateHelper
{
    public static Date cleanDate(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.setTime(date);

        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);

        return cal.getTime();
    }

    public static int getDayOfMonth(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        return cal.get(Calendar.DAY_OF_MONTH);
    }
}
