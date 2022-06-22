package se.lexicon.sdjpa_wshpart1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.sdjpa_wshpart1.entity.AppUser;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    AppUserRepository appUserRepository;

    @Autowired
    public MyCommandLineRunner(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        AppUser appUser1 = new AppUser("Hamed", "Karimi", "HMDKRM.RTJ@GMAIL.COM");
        AppUser insertedRowAppUser1 = appUserRepository.save(appUser1);
        System.out.println(insertedRowAppUser1.getId());
        System.out.println(insertedRowAppUser1.getFirstName());
        System.out.println(insertedRowAppUser1.getLastName());
        System.out.println(insertedRowAppUser1.getEmail());



    }
}
