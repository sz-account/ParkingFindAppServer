package com.myapplication.parkingfindappserver.parking;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Long> {

    @Override
    List<Parking> findAll(Sort sort);

    String HAVERSINE_FORMULA = "6371 * acos(cos(radians(:latitude)) * cos(radians(p.latitude)) *" +
            " cos(radians(p.longitude) - radians(:longitude)) + sin(radians(:latitude)) * sin(radians(p.latitude)))";
    @Transactional
    @Query("SELECT p FROM parking p WHERE " + HAVERSINE_FORMULA + " < :distance")
    List<Parking> findInRadius(@Param("latitude") double latitude, @Param("longitude") double longitude, @Param("distance") double distanceWithInKM);
}
