package com.example.A2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientRecordService {
     @Autowired
     private PatientRecordRepository patientRecordRepository;
     public List<PatientRecord> getAllPatientRecords(){
    	 return patientRecordRepository.findAll();
     }
     public PatientRecord getPatientRecordById(Long id) {
    	 return patientRecordRepository.findById(id).orElse(null);
     }
}
