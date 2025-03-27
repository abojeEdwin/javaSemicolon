import data.models.Gender;
import data.models.Height;
import data.models.Profile;
import data.repositories.Profiles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ProfileTest {

    @BeforeEach
    public void setUp(){
        Profiles profiles = new Profiles();
    }

    @Test
    public void testThatProfilesCanBeSaved(){
        Profiles profiles = new Profiles();
        Profile profile = new Profile();
        profile.setHeight(Height.SHORT);
        profile.setName("Edwin");
        profiles.save(profile);
        Assertions.assertEquals(1, profiles.count());
    }

    @Test
    public void testThatProfilesCanBeDeleted(){
        Profiles profiles = new Profiles();
        Profile profile = new Profile();
        profile.setHeight(Height.SHORT);
        profile.setName("Edwin");
        profiles.save(profile);
        profiles.delete(profile);
        Assertions.assertEquals(0, profiles.count());
    }

    @Test
    public void testThatProfileCanBeFoundById(){
        Profiles profiles = new Profiles();
        Profile profile = new Profile();
        profile.setGender(Gender.FEMALE);
        profile.setLocation("Abuja");
        profile.setId(1);
        profiles.save(profile);
        Assertions.assertEquals(profile,profiles.findProfileById(1));
    }
}
