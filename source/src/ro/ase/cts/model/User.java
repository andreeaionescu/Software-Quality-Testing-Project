package ro.ase.cts.model;

import java.util.ArrayList;

import ro.ase.cts.model.Gen;
import ro.ase.cts.model.Hobby;

/**
 * Created by Andreea-Ionescu on 5/31/2016.
 */
public class User {
    private final int idUser; //important
    private final String name; //important
    private final String email; //optional
    private final String phonenumber; //optional
    private final int age; //optional
    private final Gen gen; //optional
    private final String location; // optional

    private final ArrayList<Hobby> hobbies = new ArrayList<Hobby>(); //optional



    public ArrayList<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobby> hobbies) {
        for(Hobby h : hobbies){
            this.hobbies.add(h);
        }

    }

    public int getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Gen getGen() {
        return gen;
    }

    public String getLocation() {
        return location;
    }
    
    public String getPhonenumber() {
        return phonenumber;
    }

    public int getAge(){
    	return age;
    }
    
    public Hobby getHobbyByIndex(int index){
    	if(index>=0 && index< this.hobbies.size()-1)
    		return this.hobbies.get(index);
		return null;
    }

    @Override
    public String toString() {
        String s = "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gen=" + gen +
                ", location='" + location + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", age='" + age + '\'' +
                ", hobbies= \n";
            for(Hobby h : hobbies){
                s+=h + "\n";
            }
        return s;
    }

    private User(UserBuilder builder){
        this.idUser = builder.idUser;
        this.name = builder.name;
        this.email = builder.email;
        this.gen = builder.gen;
        this.location = builder.location;
        this.phonenumber = builder.phonenumber;
        this.age = builder.age;
        if (this.hobbies != null){
        	for(Hobby h : builder.hobbies){
                this.hobbies.add(h);
            }
        }
        else 
        	throw new UnsupportedOperationException();
        
    }
    public static class UserBuilder{
        private final int idUser;
        private final String name;
        private String email;
        private Gen gen;
        private String location;
        private String phonenumber;
        private int age;
        private ArrayList<Hobby> hobbies = new ArrayList<Hobby>();

        public UserBuilder(int idUser, String name){
            this.idUser = idUser;
            this.name = name;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder gen(Gen gen){
            this.gen = gen;
            return this;
        }

        public UserBuilder location(String location){
            this.location =location;
            return this;
        }

        public UserBuilder phonenumber(String phonenumber){
            this.phonenumber = phonenumber;
            return this;
        }
        
        public UserBuilder age(int age){
        	this.age = age;
        	return this;
        }
        
        public UserBuilder hobbies(ArrayList<Hobby> hobbies){
            for(Hobby h : hobbies){
                this.hobbies.add(h);
            }
            return this;
        }
        
        

        public User build(){
            return new User(this);
        }


    }
}
