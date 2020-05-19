package com.example.encryptiondemo.controller;

import com.example.encryptiondemo.model.requests.WeebHook;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="webhook")
public class WebhookController {

    @PostMapping(path = "")
    public WeebHook saveTester(@RequestBody WeebHook weebHook)
    {
        System.out.println("request de json : " + weebHook);
        return weebHook;
    }


}
