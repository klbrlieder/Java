// Main.java — Students version
import java.io.*;
import java.util.*;

public class Main {
    static final int MONTHS = 12;
    static final int DAYS = 28;
    static final int COMMS = 5;
    static String[] commodities = {"Gold", "Oil", "Silver", "Wheat", "Copper"};
    static String[] months = {"January","February","March","April","May","June",
            "July","August","September","October","November","December"};

    static int[][][] data = new int[MONTHS][DAYS][COMMS];


    // ======== REQUIRED METHOD LOAD DATA (Students fill this) ========
    public static void loadData() {

    }

    // ======== 10 REQUIRED METHODS (Students fill these) ========

    public static String mostProfitableCommodityInMonth(int month) {
        if (month < 0 || month >= MONTHS) {
            return "INVALID_MONTH";
        }
        int maxProfit = 0;
        String maxComm = "";

        for(int i=0;i<commodities.length;i++) {
            int profit = 0;
            for(int j=0; j<DAYS; j++) {
                profit = profit + data[month][i][j];
            }
            if  (profit > maxProfit) {
                maxProfit = profit;
                maxComm = commodities[i];
            }

        }
        return maxComm + " " + maxProfit;
    }

    public static int totalProfitOnDay(int month, int day) {
        if (month < 0 || month >= MONTHS || day < 1 || day > DAYS) {
            return -99999;
        }
        int sum = 0;
        for(int i = 0; i<commodities.length;i++) {
            sum = sum + data[month][day-1][i];

        }
        return sum;
    }

    public static int commodityProfitInRange(String commodity, int from, int to) {
        return 1234;
    }

    public static int bestDayOfMonth(int month) {
        if(month<0 || month>=months.length) {
            return -1;
        }
        int bestDay = 0;
        long maxProfit = 0;

        for(int i = 0; i < DAYS; i++) {
            long total = 0;
            for(int j = 0; j < commodities.length; j++) {
                total = total + data[month][i][j];
            }
            if(total > maxProfit) {
                maxProfit = total;
                bestDay = i + 1;
            }

        }
        return bestDay;
    }

    public static String bestMonthForCommodity(String comm) {
        return "DUMMY";
    }

    public static int consecutiveLossDays(String comm) {
        return 1234;
    }

    public static int daysAboveThreshold(String comm, int threshold) {
        return 1234;
    }

    public static int biggestDailySwing(int month) {
        return 1234;
    }

    public static String compareTwoCommodities(String c1, String c2) {
        return "DUMMY is better by 1234";
    }

    public static String bestWeekOfMonth(int month) {
        if (month < 0 || month >= MONTHS) {
            return "INVALID_MONTH";
        }
        int maxProfit = 0;
        String bestWeek = "";

        for(int week = 0; week < 4; week++) {
            int firstDay = week * 7;
            int weekProfit = 0;

            for(int day =firstDay; day<firstDay+7; day++) {
                for(int i = 0; i<commodities.length; i++) {
                    weekProfit = weekProfit + data[month][day][i];
                }
            }
            if(weekProfit > maxProfit) {
                maxProfit = weekProfit;
                bestWeek = ("Week " + (week +1));
            }
        }
        return bestWeek;
    }

    public static void main(String[] args) {
        loadData();
        System.out.println("Data loaded – ready for queries");
    }
}