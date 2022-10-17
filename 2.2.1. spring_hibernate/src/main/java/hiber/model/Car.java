package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int series;

    @Column(name = "name")
    private String model;




}
