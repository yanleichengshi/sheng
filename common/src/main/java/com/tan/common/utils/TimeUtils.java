package com.tan.common.utils;

import com.tan.common.cons.LogEnum;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class TimeUtils {
    public static Date getTime() {
        SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        String time = format.format(new Date());
        try {
            return format.parse(time);
        } catch (ParseException e) {
            log.error("{} system, cast time fail", LogEnum.DB_SYSTEEM);
            return null;
        }
    }
}
