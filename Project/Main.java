// Main.java — Students version
import java.io.*;

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
        for (int m = 0; m < months.length; m++) {
            String fileName = "Data_Files/" + months[m] + ".txt";
            File file = new File(fileName);

            if (!file.exists()) continue;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = br.readLine();
                while ((line = br.readLine()) != null) {

                    if (line.trim().isEmpty()) continue;

                    String[] parts = line.split(",");

                    if (parts.length < 3) continue;

                    int day = Integer.parseInt(parts[0].trim());
                    String commodityName = parts[1].trim();
                    int profit = Integer.parseInt(parts[2].trim());

                    int commIndex = -1;
                    for (int i = 0; i < commodities.length; i++) {
                        if (commodities[i].equals(commodityName)) {
                            commIndex = i;
                            break;
                        }
                    }
                    if (commIndex != -1 && day >= 1 && day <= DAYS) {
                        data[m][day - 1][commIndex] = profit;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error while reading the files!");
            }

        }
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
        return (maxComm + " " + maxProfit);
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
        int commIndex = -1;
        for (int i = 0; i < commodities.length; i++) {
            if (commodities[i].equals(commodity)) {
                commIndex = i;
                break;
            }
        }
        if (commIndex == -1 || from < 1 || to > DAYS || from > to) {
            return -99999;
        }

        int total = 0;
        for (int i = 0; i < MONTHS; i++) {
            for (int d = from - 1; d <= to - 1; d++) {
                total = total + data[i][d][commIndex];
            }
        }
        return total;
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
        int commIndex = -1;
        for (int i = 0; i < commodities.length; i++) {
            if (commodities[i].equals(comm)) {
                commIndex = i;
                break;
            }
        }
        if (commIndex == -1) {
            return "INVALID_COMMODITY";
        }

        int maxProfit = 0;
        int bestMonth = 0;

        for (int m = 0; m < MONTHS; m++) {
            int monthTotal = 0;
            for (int d = 0; d < DAYS; d++) {
                monthTotal = monthTotal + data[m][d][commIndex];
            }
            if (monthTotal > maxProfit) {
                maxProfit = monthTotal;
                bestMonth = m;
            }
        }
        return months[bestMonth];
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