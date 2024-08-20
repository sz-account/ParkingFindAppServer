package com.myapplication.parkingfindappserver.parking.description;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myapplication.parkingfindappserver.parking.Parking;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "description")
public class Description {

    @Id
    public Long id;

    @JsonIgnore
    @OneToOne
    @MapsId
    public Parking parking;

    String des;
    String price;

    @Lob
    @Column(name = "image", columnDefinition="BLOB")
    byte[] image;
}
