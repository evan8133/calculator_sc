package lecture1.model;

import java.io.Serializable;

public class Calculator implements Serializable {
    private double state;

    public Calculator() {
        this.state = 0.0;
    }

    public void plus(double number) {
        this.state += number;
    }

    public double getState() {
        return this.state;
    }

    public void minus(double number) {
        this.state -= number;
    }

    public void setState(Double state) {
        this.state = state;
    }
}
