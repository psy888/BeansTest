package weekdays;

public class Thursday implements WeekDay{

    @Override
    public String getWeekDayName() {
        return this.getClass().getSimpleName();
    }
}
