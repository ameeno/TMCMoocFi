public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
            int d1 = (this.day + ((this.month-1) * 30) + (this.year * 365));
            int d2 = comparedDate.day + ((comparedDate.month-1) * 30) + (comparedDate.year * 365);
            int result = Math.abs(d1 - d2);

        return result/365;
    }
}
