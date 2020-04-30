package com.mc.informationsystem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alerts")
public class AlertController {

    @Autowired
    private IAlertService alertService;

    @GetMapping(value = "/")
    public List<Alert> getAllAlerts() {
        return alertService.findAll();
    }

    @GetMapping(value = "/{relatedSystem}")
    public List<Alert> getAlertsBySystem(@PathVariable("relatedSystem") String relatedSystem) {
        return alertService.findByRelatedSystem(relatedSystem);
    }

    @GetMapping(value = "/{severity}")
    public List<Alert> getAlertsBySeverity(@PathVariable("severity") String severity) {
        return alertService.findBySeverity(severity);
    }

    @GetMapping(value = "/orderByOccurance")
    public List<Alert> findAllByOrderByOccuranceDesc() {
        return alertService.findAllByOrderByOccuranceDesc();
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody Alert alert) {
        alertService.saveOrUpdateAlert(alert);
        try {
            return new ResponseEntity("Alert added successfully", HttpStatus.OK);
        }
        catch(Exception ex) {
            ///TODO log errors
            return new ResponseEntity("Alert was not able to add", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /* We do not want to delete alerts, it can be done similarly below
    @DeleteMapping(value = "/{id}")
    public void deleteAlert(@PathVariable Long studentNumber) {
        //TODO if needed
    }
    */
}