package weekdays;

public class Friday implements WeekDay{

    @Override
    public String getWeekDayName() {
        return this.getClass().getSimpleName();
    }
}
