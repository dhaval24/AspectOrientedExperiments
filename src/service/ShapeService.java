package service;
import model.Circle;
import model.Triangle;
import org.dhaval.springexperiment.aop.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Dhaval on 4/5/2016.
 */
@Component
public class ShapeService {

    @Autowired
    private Circle circle;
    @Autowired
    private Triangle triangle;

    @Loggable
    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }


}
