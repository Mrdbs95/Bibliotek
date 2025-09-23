package org.example;

public class Member {
    private final String id ;
    private String Name;
    private String email;



    public String getId() { return id; }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Member(String id, String name, String email){
        if (id == null || id .isBlank()) throw new IllegalArgumentException("id is required");
        setName (name);
        setEmail(email);
        this .id = id.trim();


    }
    @Override
    public String toString(){
        return "Member{id = '%s',email =' %s'}".formatted (id, name, email);
    }

}
