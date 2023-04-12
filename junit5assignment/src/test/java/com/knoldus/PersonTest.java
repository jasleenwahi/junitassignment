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
    void testGetName_WithNonNullValue_ShouldReturnName() {
        person.setName("Jasleen");
        Assertions.assertEquals("Jasleen", person.getName());
    }

    @Test
    @DisplayName("Test getName() with null value")
    void testGetName_WithNullValue_ShouldReturnNull() {
        person.setName(null);
        Assertions.assertNull(person.getName());
    }

    @Test
    @DisplayName("Test getAge() with not-null value")
    void testGetAge_WithNonNullValue_ShouldReturnAge() {
        person.setAge(25);
        Assertions.assertEquals(25, person.getAge());
    }

    @Test
    @DisplayName("Test getAge() with null value")
    void testGetAge_WithNullValue_ShouldReturnZero() {
        person.setAge(0);
        Assertions.assertEquals(0, person.getAge());
    }
    
    @Test
    @DisplayName("Test getEmail() with not-null value")
    void testGetEmail_WithNonNullValue_ShouldReturnEmail() {
        person.setEmail("Jasleen.kaur@test.com");
        Assertions.assertEquals("Jasleen.kaur@test.com", person.getEmail());
    }

    @Test
    @DisplayName("Test getEmail() with null value")
    void testGetEmail_WithNullValue_ShouldReturnNull() {
        person.setEmail(null);
        Assertions.assertNull(person.getEmail());
    }

    @Test
    @DisplayName("Test getEmail() if it is valid")
    public void emailTestCheck_ForValidation_ShouldReturnTrue(){
        String email = person.getEmail();
        assertTrue(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
    }
    
    @Test
    @DisplayName("Test setAge() with negative integer")
    void testSetAge_WithNegativeInteger_ShouldThrowAnException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setAge(-30));
    }
    
    @AfterEach
    public void teardown() {
         System.out.println("called after every test");
    }
}
