package com.efl.efreelearndao.service;

import java.util.List;
import java.util.Optional;

import com.efl.efreelearndao.dto.SchoolInfoDTO;
import com.efl.efreelearndao.entity.School;



public interface SchoolService {
	
	List<School> getAllSchoolInfos();

	Optional<School> getSchoolInfoById(Long SchoolInfoId);

	School createSchoolInfo(School SchoolInfo);	

	School updateSchoolInfo(School SchoolInfoDetails);

	void deleteSchoolInfo(School SchoolInfo);
}
