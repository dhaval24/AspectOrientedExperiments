package model;

import org.dhaval.springexperiment.aop.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Dhaval on 4/5/2016.
 */
@Component
public class Circle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setter called");
        this.name = name;
        throw (new RuntimeException());
    }
}
