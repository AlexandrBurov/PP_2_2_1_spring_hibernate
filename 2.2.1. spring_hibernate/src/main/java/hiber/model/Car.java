package hiber.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {

    private String model;

    private int series;

}
