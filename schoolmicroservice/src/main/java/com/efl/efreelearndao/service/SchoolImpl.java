package com.efl.efreelearndao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efl.efreelearndao.dto.SchoolInfoDTO;
import com.efl.efreelearndao.entity.School;
import com.efl.efreelearndao.repository.SchoolRepository;
@Service
public class SchoolImpl implements SchoolService{

	@Autowired
	SchoolRepository schoolInfoRepository;
	
	@Override
	public List<School> getAllSchoolInfos() {
		// TODO Auto-generated method stubgetAllSchoolInfos
		return this.schoolInfoRepository.findAll();
	}



	@Override
	public School createSchoolInfo(School schoolInfo) {
		return this.schoolInfoRepository.save(schoolInfo);
	
	 	
	}

	@Override
	public School updateSchoolInfo(School SchoolInfoDetails) {
		// TODO Auto-generated method stub
		return this.schoolInfoRepository.save(SchoolInfoDetails);
		}

	@Override
	public void deleteSchoolInfo(School SchoolInfo) {
		 this.schoolInfoRepository.delete(SchoolInfo);
		
	}



	@Override
	public Optional<School> getSchoolInfoById(Long SchoolInfoId) {
		
		
			return this.schoolInfoRepository.findById(0);
		
		
	}

}
