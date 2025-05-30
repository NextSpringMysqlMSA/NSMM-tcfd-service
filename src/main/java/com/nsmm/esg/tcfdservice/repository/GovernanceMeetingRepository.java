package com.nsmm.esg.tcfdservice.repository;

import com.nsmm.esg.tcfdservice.entity.GovernanceMeeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GovernanceMeetingRepository extends JpaRepository<GovernanceMeeting, Long> {
    List<GovernanceMeeting> findByMemberId(Long memberId);

}
