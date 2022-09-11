package service;

import model.Gender;
import model.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class PersonService {
    public ArrayList<Person> getAllPerson(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(1, new int[]{1,2},"director123","123456","Boss", Gender.MALE, LocalDate.of(1990,8, 5),"director@gmail.com","0948888888",0));
        people.add(new Person(2, new int[]{2},"admin123","123456","Hoàng Trần", null, null,"admin@gmail.com",null,0));

        return people;
    }
}
