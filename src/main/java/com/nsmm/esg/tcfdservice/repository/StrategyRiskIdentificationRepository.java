package com.nsmm.esg.tcfdservice.repository;

import com.nsmm.esg.tcfdservice.entity.StrategyRiskIdentification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface StrategyRiskIdentificationRepository extends JpaRepository<StrategyRiskIdentification, Long> {
    List<StrategyRiskIdentification> findByMemberId(Long memberId);

}
