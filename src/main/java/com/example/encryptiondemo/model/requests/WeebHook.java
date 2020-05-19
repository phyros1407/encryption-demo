package com.example.encryptiondemo.model.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeebHook {

    private FormResponse formResponse;

    @Override
    public String toString() {
        return "WeebHook{" +
                "formResponse=" + formResponse +
                '}';
    }
}
