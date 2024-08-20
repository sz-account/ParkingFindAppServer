package com.myapplication.parkingfindappserver.parking;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/parking")
public class ParkingController {

    private final ParkingService parkingService;

    @PostMapping
    public List<Parking> getInRadius(@RequestParam double lat, @RequestParam double lon)
    {
        return parkingService.getInRadius(lat, lon);
    }
}
