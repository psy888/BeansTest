package jpaMySqlExample;

import jpaMySqlExample.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

    @Autowired
    private BookRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }


    public void run(String... args) throws Exception {

        Thread thr1 = new Thread(()->{
            repository.save(new Book("Book1"));
            repository.save(new Book("Book2"));
            repository.save(new Book("Book3"));
            repository.save(new Book("Java"));
            repository.save(new Book("Book1"));
            repository.save(new Book("Book2"));
            repository.save(new Book("Book3"));
            repository.save(new Book("Java"));
            System.out.println("findByName thr1");
            repository.findByName("Java").forEach(System.out::println);
            System.out.println("thr1 finish");
        });
        Thread thr2 = new Thread(()->{
            repository.save(new Book("Java"));
            repository.save(new Book("Ruby"));
            repository.save(new Book("JS"));
            repository.save(new Book("Java"));
            repository.save(new Book("Book2"));
            repository.save(new Book("Book3"));
            repository.save(new Book("Java"));
            repository.save(new Book("Ruby"));
            System.out.println("findByName thr2");
            repository.findByName("Java").forEach(System.out::println);
            System.out.println("thr2 finish");
        });
        thr1.start();
        thr2.start();
        repository.save(new Book("Book1"));
        repository.save(new Book("Book2"));
        repository.save(new Book("Book3"));
        repository.save(new Book("Java"));
        repository.save(new Book("Ruby"));
        repository.save(new Book("JS"));
        repository.save(new Book("Java"));

        System.out.println("findAll");
        repository.findAll().forEach(System.out::println);

        System.out.println("findById");
        repository.findById(1L).ifPresent(System.out::println);

        System.out.println("findByName");
        repository.findByName("Java").forEach(System.out::println);

    }
}
