package com.example.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="city_def")
public class CityDef implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "city_def_seq")
    @SequenceGenerator(sequenceName = "city_defs",name = "city_def_seq",allocationSize = 1)
    Long defId;

    @Column
    String name;

    @Column(name="city_id")
    Long cityId;

//    @ManyToOne
//    @JoinColumn(name="city_id")
//    City city;

    public CityDef() {
    }

    public CityDef(String name, Long cityId) {
        this.name = name;
        this.cityId = cityId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getDefId() {
        return defId;
    }

    public void setDefId(Long defId) {
        this.defId = defId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "CityDef{" +
                "defId=" + defId +
                ", name='" + name + '\'' +
                ", cityId=" + cityId +
                '}';
    }
}
