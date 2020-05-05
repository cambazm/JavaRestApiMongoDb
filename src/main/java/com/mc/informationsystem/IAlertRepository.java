package com.mc.informationsystem;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IAlertRepository extends MongoRepository<Alert, String> {
    List<Alert> findByRelatedSystem(String relatedSystem);
    List<Alert> findBySeverity(String email);
    List<Alert> findAllByOrderByOccuranceDesc();
}