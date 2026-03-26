package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagePostTest {
    MessagePost messagePost1;
    MessagePost messagePost2;


    @BeforeEach
    void setUp() {
       messagePost1 = new MessagePost("Mary", "Hi there.");
       messagePost2 = new MessagePost("John", "I'm on my way.");
    }

    @AfterEach
    void tearDown() {
        messagePost1 = null;
        messagePost2 = null;
    }

    @Test
    void setMessage() {
        assertEquals("Hi there." ,messagePost1.getMessage());
        assertEquals("I'm on my way." ,messagePost2.getMessage());

        messagePost1.setMessage("Bye Bye");
        messagePost2.setMessage("Wait.. Wait..");
        assertEquals("Bye Bye", messagePost1.getMessage());
        assertEquals("Wait.. Wait..", messagePost2.getMessage());
        //TODO  test when try to set a message that's too long

        // 40 characters
        messagePost1.setMessage("1234567890123456789012345678901234567890");
        // 41 characters
        messagePost2.setMessage("12345678901234567890123456789012345678901");
        assertEquals("1234567890123456789012345678901234567890", messagePost1.getMessage());
        assertEquals("Wait.. Wait..", messagePost2.getMessage());
    }
}