package com.efl.efreelearndao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efl.efreelearndao.dto.SchoolInfoDTO;
import com.efl.efreelearndao.entity.School;
@Repository
public interface SchoolRepository extends JpaRepository<School,Integer>{
	

  
}
