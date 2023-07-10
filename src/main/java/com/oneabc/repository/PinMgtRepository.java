package com.oneabc.repository;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oneabc.entity.PinMgt;

@Repository
public interface PinMgtRepository extends JpaRepository<PinMgt, Long> {

	@Transactional
	@Modifying
	@Query("update PinMgt p set p.currentMpin = :currentMpin, modifiedBy = :modifiedBy, modifiedDate = :modifiedDate, mpinExpiry = :mpinExpiry where p.id = :id")
	void updateMpin(@Param("currentMpin") String currentMpin, @Param("modifiedBy") String modifiedBy,
			@Param("modifiedDate") LocalDateTime modifiedDate, Date mpinExpiry, @Param("id") long id);
}
