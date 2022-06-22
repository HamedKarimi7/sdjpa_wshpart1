package se.lexicon.sdjpa_wshpart1.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.sdjpa_wshpart1.entity.AppUser;

import java.util.List;

public interface AppUserRepository extends CrudRepository<AppUser, Integer> {

   //if we want to find by firstName and it's not available in crud repository default then follow like below
    // List<AppUser> findByFirstName(String firstName);

}
