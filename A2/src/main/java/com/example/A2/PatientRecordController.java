package com.example.A2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PatientRecordController {
    @Autowired
    private PatientRecordService patientRecordService;
    @GetMapping("/patient_records")
    public List<PatientRecord> getAllPatientRecords(){
    	return patientRecordService.getAllPatientRecords();
    }
    @GetMapping("/patient_records/{id}")
    public PatientRecord getPatientRecordById(@PathVariable Long id) {
    	return patientRecordService.getPatientRecordById(id);
    }
}
