package se.lexicon.sdjpa_wshpart1.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.sdjpa_wshpart1.entity.AppUser;

import java.util.List;
import java.util.Optional;

public interface AppUserRepository extends CrudRepository<AppUser, Integer> {

   //if we want to find by firstName or email,..(except ID cause its generate auto )
    //  and it's not available in crud repository default then follow like below and add what you want to find based on

        Optional<AppUser> findByEmailIgnoreCase(String email);
        List<AppUser> findByFirstName(String firstName);
        List<AppUser> findByFirstNameAndLastName(String firstName, String lastName);
        List<AppUser> findByFirstNameIgnoreCaseAndLastNameIgnoreCase(String firstName, String lastName);

}
