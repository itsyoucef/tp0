package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFullName_ShouldReturnCorrectFullName() {
        Person person = new Person("fatah", "youcef", 25);
        String fullName = person.getFullName();
        assertEquals("fatah youcef", fullName);
    }

    @Test
    void isAdult_ShouldReturnTrue_WhenAgeIs18OrMore() {
        Person adult = new Person("bichari", "abdeldjalil", 18);
        assertTrue(adult.isAdult());
    }

    @Test
    void isAdult_ShouldReturnFalse_WhenAgeIsLessThan18() {
        Person child = new Person("rebidj", "oussama", 17);
        assertFalse(child.isAdult());
    }
}