package se.lexicon.sdjpa_wshpart1.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.sdjpa_wshpart1.entity.AppUser;

import java.util.List;

public interface AppUserRepository extends CrudRepository<AppUser, Integer> {

    List<AppUser> findByFirstName(String firstName);

}
