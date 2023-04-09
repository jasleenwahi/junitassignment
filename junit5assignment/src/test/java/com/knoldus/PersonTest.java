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
    @DisplayName("Test getName() with not-null value")
    void testGetNameWithNonNullValue() {
        person.setName("Jasleen");
        Assertions.assertEquals("Jasleen", person.getName());
    }

    @Test
    @DisplayName("Test getName() with null value")
    void testGetNameWithNullValue() {
        person.setName(null);
        Assertions.assertNull(person.getName());
    }

    @Test
    @DisplayName("Test getAge() with not-null value")
    void testGetAge_With_Non_Null_Value() {
        person.setAge(25);
        Assertions.assertEquals(25, person.getAge());
    }

    @Test
    @DisplayName("Test getAge() with null value")
    void testGetAge_With_Null_Value() {
        person.setAge(0);
        Assertions.assertEquals(0, person.getAge());
    }
    
    @Test
    @DisplayName("Test getEmail() with not-null value")
    void testGetEmail_With_Non_Null_Value() {
        person.setEmail("Jasleen.kaur@test.com");
        Assertions.assertEquals("Jasleen.kaur@test.com", person.getEmail());
    }

    @Test
    @DisplayName("Test getEmail() with null value")
    void testGetEmail_With_Null_Value() {
        person.setEmail(null);
        Assertions.assertNull(person.getEmail());
    }

    @Test
    @DisplayName("Test getEmail() if it is valid")
    public void emailTest_Check_For_Validation(){
        String email = person.getEmail();
        assertTrue(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
    }
    
    @Test
    @DisplayName("Test setAge() with negative integer")
    void testSetAge_With_NegativeInteger() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setAge(-30));
        //The assertion checks whether the expected exception is thrown when the code inside the lambda expression (() -> person.setAge(-5)) is executed.
    }

    @Test
    public void testSetAge_With_Zero() {
        int age = 0;
        person.setAge(age);
        Assertions.assertEquals(age, person.getAge());
    }

}
