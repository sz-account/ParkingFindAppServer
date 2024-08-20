package com.myapplication.parkingfindappserver.parking.hours;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myapplication.parkingfindappserver.parking.Parking;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "hours")
public class Hours {

    @Id
    public Long id;

    @JsonIgnore
    @OneToOne
    @MapsId
    public Parking parking;

    @ElementCollection
    public List<String> hoursList;
}
