package se.lexicon.sdjpa_wshpart1.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.sdjpa_wshpart1.entity.AppUser;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class AppUserRepositoryTest {

    @Autowired
    private AppUserRepository testObject;

    @BeforeEach
    public void setup(){

        AppUser appUser = new AppUser("hamed", "karimi", "hmd@gm.com");
        testObject.save(appUser); //testObject.save(new AppUser("hamed", "karimi", "hmd@gm.com");


    }


    @Test
    public void given_email_findByEmail_return_optional_present(){
        AppUser expectedContent = new AppUser("hamed", "karimi", "hmd@gm.com");
        Optional<AppUser> result = testObject.findByEmailIgnoreCase("hm@gm.com");
        assertTrue(result.isPresent());
        assertEquals(expectedContent, result.get());

    }



}
