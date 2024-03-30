package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationRepository {

    private List<Application> applicationList = new ArrayList<>();

    public Application save(Application application) {
        applicationList.add(application);
        return application;
    }
    public List<Application> getApplicationListByEmail(String email){
        return applicationList.stream().filter(application -> application.getUser().getEmail().equals(email)).collect(Collectors.toList());

    }
}
