package data.repositories;
import data.models.Profile;

import java.util.List;

public interface ProfileRepository {
    Profile save(Profile profile);
    long count();
    List<Profile> findAll();
    void delete(Profile profile);
    Profile findProfileById(int id);


}
