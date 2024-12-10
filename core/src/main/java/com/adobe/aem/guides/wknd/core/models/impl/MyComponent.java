package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Component( name = "example.mycomponent", immediate = true)
@Service(MyService.class)
public class MyComponent implements MyService {

    @Override
    public void execute() {

    }
}