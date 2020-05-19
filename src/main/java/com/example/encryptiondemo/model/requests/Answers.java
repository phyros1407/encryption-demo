package com.example.encryptiondemo.model.requests;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answers {

    private String type;
    private String text;
    private String email;
    private Integer number;
    @JsonAlias("boolean")
    private Boolean flag;

    @Override
    public String toString() {
        return "Answers{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", email='" + email + '\'' +
                ", number=" + number +
                ", flag=" + flag +
                '}';
    }
}
