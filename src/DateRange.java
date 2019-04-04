import java.util.Date;

public class DateRange {
    public Date from;
    public Date to;
    public long toHours() {
        long millis = to.getTime() - from.getTime();
        return millis / 1000 / 3600;
    }
}

