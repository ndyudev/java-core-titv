package JavaCore.OOP.VD37;

public class DateOfBirth {
    private String day;
    private String month;
    private String year;

    public DateOfBirth() {}

    public DateOfBirth(String day, String year, String month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "DateOfBirth{" +
                "day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
