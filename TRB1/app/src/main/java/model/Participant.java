package model;

import java.util.ArrayList;

public class Participant {

    private static ArrayList<Event> events;

    public static ArrayList<Event> getSubscribed(){
        if(events == null) events = new ArrayList<>();
        return events;
    }

    private String name;
    private String email;
    private String cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
