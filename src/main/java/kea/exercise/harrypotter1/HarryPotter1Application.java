package kea.exercise.harrypotter1;

import kea.exercise.harrypotter1.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HarryPotter1Application {

    public static void main(String[] args) {
        SpringApplication.run(HarryPotter1Application.class, args);
        Application.main(args);
        System.out.println("All tasks completed. Thank you & happy coding :)");

    }

}
