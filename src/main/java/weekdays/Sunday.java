package weekdays;

public class Sunday implements WeekDay{

    @Override
    public String getWeekDayName() {
        return this.getClass().getSimpleName();
    }
}
