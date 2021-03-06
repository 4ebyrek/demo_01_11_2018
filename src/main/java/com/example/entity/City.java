package com.example.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="city")
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cities")
    @SequenceGenerator(sequenceName = "cities",name = "cities",allocationSize = 1)
    Long cityId;

    @Column
    String location;

    @OneToOne
    @JoinColumn(name="def_id")
    CityDef cityDef;

    public City() {
    }

    public City(String location, CityDef cityDef) {
        this.location = location;
        this.cityDef = cityDef;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CityDef getCityDef() {
        return cityDef;
    }

    public void setCityDef(CityDef cityDef) {
        this.cityDef = cityDef;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", location='" + location + '\'' +
                ", cityDef=" + cityDef +
                '}';
    }
}
