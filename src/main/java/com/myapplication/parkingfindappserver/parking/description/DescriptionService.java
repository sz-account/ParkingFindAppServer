package com.myapplication.parkingfindappserver.parking.description;

import com.myapplication.parkingfindappserver.parking.ParkingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DescriptionService {

    DescriptionRepository descriptionRepository;
    ParkingService parkingService;

    Optional<Description> findById(Long id) throws Exception {

        return descriptionRepository.findById(id) ;
    }
}
