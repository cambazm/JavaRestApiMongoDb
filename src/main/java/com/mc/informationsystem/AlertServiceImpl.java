/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.informationsystem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertServiceImpl implements IAlertService {

    @Autowired
    private IAlertRepository alertRepository;

    @Override
    public List<Alert> findAll() {
        return alertRepository.findAll();
    }

    @Override
    public List<Alert> findByRelatedSystem(String relatedSystem) {
        return alertRepository.findByRelatedSystem(relatedSystem);
    }

    @Override
    public List<Alert> findBySeverity(String severity) {
        return alertRepository.findBySeverity(severity);
    }

    @Override
    public List<Alert> findAllByOrderByOccuranceDesc() {
        return alertRepository.findAllByOrderByOccuranceDesc();
    }

    @Override
    public void saveOrUpdateAlert(Alert alert) {
        alertRepository.save(alert);
    }

    /*
    @Override
    public void deleteAlert(String id) {
        alertRepository.deleteById(id);
    }
    */
}
