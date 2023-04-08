package com.knoldus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {

    private Person person;
    @BeforeEach
    public void setup(){
        person = new Person();
    }

    @Test
    public void nameTest(){

        person.setName("");
        assertEquals("", person.getName());
        person.setName("jasleen");
        assertEquals("jasleen", person.getName());
    }

    @Test
    public void ageTest(){
        person.setAge(32);
        assertEquals(32, person.getAge());
        person.setAge(0);
        assertTrue(person.getAge()<=0, "Age cannot be negative or zero");
    }

    @Test
    public void emailTest(){
        person.setEmail("jasleenkaur556677@gmail.com");
        assertEquals("jasleenkaur556677@gmail.com", person.getEmail());
        String email = person.getEmail();
        assertTrue(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
    }


}
