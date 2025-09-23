package org.example;

public class Member {
    private final String id ;
    private String Name;
    private String email;

    public Member(String id, String name, String email){
        if (id == null || id .isBlank()) throw new IllegalArgumentException("id is required");
    }
}
