package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Component( name = "example.mycomponent", immediate = true)
@Service(MyService.class)
public class MyComponent implements MyService {

    @Override
    public void execute() {
        String role = "admin";
        String message = getWelcomeMessage(role);
        System.out.println(message);
        printMultiLineString() ;
    }

    public static String getWelcomeMessage(String role) {
        String message;
        switch (role) {
            case "admin":
                message = "Welcome, Administrator!";
                break;
            case "user":
                message = "Welcome, User!";
                break;
            case "guest":
                message = "Welcome, Guest!";
                break;
            default:
                message = "Welcome!";
        }
        return message;
    }

    public static void printMultiLineString() {
        String text = "This is a multi-line\n"
                + "string example\n"
                + "that could use modern features.";
        System.out.println(text);
    }
}