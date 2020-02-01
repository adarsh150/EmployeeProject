package com.adarsh.learnJava;
import com.adarsh.learnJava.Person;
import com.adarsh.learnJava.Response;
public interface PersonService {

    public Response addPerson(Person p);

    public Response deletePerson(int id);

    public Person getPerson(int id);

    public Person[] getAllPersons();

}
