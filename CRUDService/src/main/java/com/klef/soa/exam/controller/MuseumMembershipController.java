
package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.MuseumMembership;
import com.klef.soa.exam.service.MuseumMembershipService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/museum")
@CrossOrigin
public class MuseumMembershipController {

    @Autowired
    private MuseumMembershipService service;
    
    @GetMapping("/")
    public ResponseEntity<String> member() {
    return ResponseEntity.ok("Member ship Service Running");
    }

   
    @PostMapping("/add")
    public ResponseEntity<MuseumMembership> addMemberships(
    @RequestBody MuseumMembership m) {

    	MuseumMembership MEMBER = service.addMs(m);

    return ResponseEntity.status(201).body(MEMBER);
    }
   

    @GetMapping("/displayall")
    public ResponseEntity<List<MuseumMembership>> displayAll()
    {
    List<MuseumMembership> MEM = service.displayAll();
    return ResponseEntity.status(200).body(MEM);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMEMBERById(@PathVariable Long id)
    {
    String MEM = service.deleteMuseumMembershipById(id);
    return new ResponseEntity<>(MEM, HttpStatus.OK);
    }
    
}
