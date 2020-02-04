package weekdays;

public class Saturday implements WeekDay{

    @Override
    public String getWeekDayName() {
        return this.getClass().getSimpleName();
    }
}
