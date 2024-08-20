package com.myapplication.parkingfindappserver.parking;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ParkingService {

    private final ParkingRepository parkingRepository;

    public List<Parking> getInRadius(double latitude, double longitude)
    {
        return parkingRepository.findInRadius(latitude, longitude, 5);
    }

    public Optional<Parking> findById(Long id)
    {
        return parkingRepository.findById(id);
    }

    public void save(Parking parking)
    {
        parkingRepository.save(parking);
    }
}
