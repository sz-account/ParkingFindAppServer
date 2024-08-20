package com.myapplication.parkingfindappserver.parking.description;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping(path = "parking/desc")
public class DescriptionController {

    @Autowired
    DescriptionService descriptionService;

    @PostMapping
    Optional<Description> findById(@RequestParam Long id) throws Exception {

       return descriptionService.findById(id) ;
    }

}
