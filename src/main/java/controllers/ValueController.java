package controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

import models.StringData;

@RestController
public class ValueController {
    private StringData savedData = new StringData("blank", "system");
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public StringData saveValue(@RequestBody StringData newData) {
        StringData oldData = savedData;
        savedData = newData;
        return oldData;
    }

    @RequestMapping(value="/current", method=RequestMethod.GET)
    public StringData getValue() {
        return savedData;
    }
}
