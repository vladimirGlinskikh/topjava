package ru.javawebinar.topjava.util.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionUtil {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    public static void check(boolean found, int id) {
        check(found, id);
    }

    public static <T> T check(T object, int id){
        return check(object, id);
    }
}
