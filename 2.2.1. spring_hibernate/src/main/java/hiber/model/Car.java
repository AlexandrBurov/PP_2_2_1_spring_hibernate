package hiber.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;


@Entity
@Table(name = "cars")
public class Car {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "series")
    private int series;


    @Column(name = "model")
    private String model;
//--------------------------------------------

//@OneToOne
//private User user;


//--------------------------------------------
    public Car(){
}

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }

//--------------------------------------------

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

//--------------------------------------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


//--------------------------------------------


    @Override
    public String toString() {
        return  "id = " + id +
                ", series = " + series +
                ", model = " + model;
    }
}
