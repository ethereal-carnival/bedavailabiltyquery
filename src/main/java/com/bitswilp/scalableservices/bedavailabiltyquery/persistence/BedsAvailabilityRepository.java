package com.bitswilp.scalableservices.bedavailabiltyquery.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BedsAvailabilityRepository extends JpaRepository<BedsAvailabilityDBEntity, String> {
    List<BedsAvailabilityDBEntity> findByHospitalId(String hospitalID);
}
