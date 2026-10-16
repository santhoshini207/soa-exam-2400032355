package com.klef.soa.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.soa.exam.entity.MuseumMembership;



@Repository
public interface MuseumMembershipRepository extends JpaRepository<MuseumMembership, Long> {


}
