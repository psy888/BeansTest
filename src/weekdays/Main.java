package weekdays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("weekDay = " + weekDay.getWeekDayName());

        Cat cat = context.getBean(Cat.class);
        System.out.println("cat = " + cat.getName());
    }
}
