package weekdays;

public class Tuesday implements WeekDay{

    @Override
    public String getWeekDayName() {
        return this.getClass().getSimpleName();
    }
}
