
package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.MuseumMembership;

public interface MuseumMembershipService {

    MuseumMembership addMs(MuseumMembership m);//
    List<MuseumMembership> displayAll();//
    
    String deleteMuseumMembershipById(Long id);
    

}
