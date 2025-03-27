package data.repositories;

import data.models.Profile;

import java.util.ArrayList;
import java.util.List;

public class Profiles implements ProfileRepository {
    List<Profile>profiles = new ArrayList<>();

    public Profile save(Profile profile) {
        profiles.add(profile);
        return profile;
    }


    public long count() {
        return profiles.size();
    }


    public List<Profile> findAll() {
        return profiles;
    }


    public void delete(Profile profile) {
        if(profile == null){
            throw new NullPointerException("profile cannot be null");
        }
        profiles.remove(profile);
    }


    public Profile findProfileById(int id) {
        for(Profile profile : profiles){
            if(profile.getId() == id){
                return profile;
            }
        }
        return null;
    }
}
