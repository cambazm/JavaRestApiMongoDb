package com.mc.informationsystem;
import java.util.*;

public interface IAlertService {
    List<Alert> findAll();
    List<Alert> findByRelatedSystem(String relatedSystem);
    List<Alert> findBySeverity(String severity);
    List<Alert> findAllByOrderByOccuranceDesc();
    void saveOrUpdateAlert(Alert alert);
    //void deleteAlert(String id);
}
