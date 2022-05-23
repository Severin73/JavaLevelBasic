package com.javalevelbasic.task030;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Write a program that will return the number of milliseconds that
 * have passed from the same number, but last month to today's date.
 * For example, if today is August 3rd, then find out how many
 * milliseconds have passed since July 3rd.
 */
public class FindMilliseconds {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime lastMonth = now.minusMonths(1);
        System.out.println(findMilliseconds(lastMonth, now));
    }

    /**
     * Find milliseconds between two dates.
     * @param startDate
     * @param endDate
     * @return
     */
    private static long findMilliseconds(LocalDateTime startDate, LocalDateTime endDate) {
        Duration duration = Duration.between(startDate, endDate);
        return duration.toMillis();
    }

}
