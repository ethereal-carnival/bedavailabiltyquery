package com.bitswilp.scalableservices.bedavailabiltyquery.api;

import com.bitswilp.scalableservices.bedavailabiltyquery.persistence.BedsAvailabilityDBEntity;
import com.bitswilp.scalableservices.bedavailabiltyquery.service.BedsAvailabilityService;
import com.bitswilp.scalableservices.commonlibrary.communicationmodels.BedsAvailability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.bitswilp.scalableservices.commonlibrary.constants.URLs.BED_AVAILABILITY;
import static com.bitswilp.scalableservices.commonlibrary.constants.URLs.URL_COMPONENT_ADD;
import static com.bitswilp.scalableservices.commonlibrary.constants.URLs.URL_COMPONENT_GET;

@RestController
public class BedsAvailabilityController {

    private final BedsAvailabilityService bedsAvailabilityService;

    @Autowired
    public BedsAvailabilityController(BedsAvailabilityService bedsAvailabilityService) {
        this.bedsAvailabilityService = bedsAvailabilityService;
    }

    @PostMapping(URL_COMPONENT_ADD + BED_AVAILABILITY)
    public void addData(@RequestParam BedsAvailabilityDBEntity bedsAvailabilityDBEntity) {
        bedsAvailabilityService.addData(bedsAvailabilityDBEntity);
    }

    @PostMapping(URL_COMPONENT_GET + BED_AVAILABILITY)
    public BedsAvailability getStats(@RequestParam String hospitalId) {
        return bedsAvailabilityService.getStats(hospitalId);
    }
}
