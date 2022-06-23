package se.lexicon.sdjpa_wshpart1.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppUserTest {

    private AppUser testObject;

    @BeforeEach
    public void SETUP(){
        testObject = new AppUser(1,"Hamed", "Karimi", "HK@GMAIL.COM");

    }

    @Test
    public void testObject_successfully_created(){

        assertEquals(1, testObject.getId());
        assertEquals("Hamed", testObject.getFirstName());
        assertEquals("Karimi", testObject.getLastName());
        assertEquals("HK@GMAIL.COM", testObject.getEmail());

    }

    @Test
      public void test_equal_and_hashcode_true(){
        AppUser copy = new AppUser(1,"Hamed", "Karimi", "HK@GMAIL.COM");
        assertEquals(copy, testObject);
        assertEquals(copy.hashCode(), testObject.hashCode());

    }

    @Test
     public void test_toString_contains(){
     String toString = testObject.toString();

         assertTrue(

                         toString.contains("1") &&
                                  toString.contains("Hamed") &&
                                 toString.contains("Karimi") &&
                                 toString.contains("HK@GMAIL.COM")

                 );



    }



}
