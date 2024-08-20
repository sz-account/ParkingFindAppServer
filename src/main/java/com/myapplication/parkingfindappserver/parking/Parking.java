package com.myapplication.parkingfindappserver.parking;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myapplication.parkingfindappserver.parking.description.Description;
import com.myapplication.parkingfindappserver.parking.hours.Hours;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "parking")
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "parking", cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    private Hours hours;

    @JsonIgnore
    @OneToOne(mappedBy = "parking", cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    private Description description;

    public String name;
    public Long slots;
    public double latitude;
    public double longitude;
    public String address;
    public String city;
    public boolean disabledParkingSpots;
    public boolean monitoring;
    public boolean isFree;
}
