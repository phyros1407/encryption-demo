package com.example.encryptiondemo.model.requests;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FormResponse {

    private String form_id;
    private List<Answers> answers;

    @Override
    public String toString() {
        return "FormResponse{" +
                "form_id='" + form_id + '\'' +
                ", answers=" + answers +
                '}';
    }
}
