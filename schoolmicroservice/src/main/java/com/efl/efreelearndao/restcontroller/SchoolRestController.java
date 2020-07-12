package com.efl.efreelearndao.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.efl.efreelearndao.dto.SchoolInfoDTO;
import com.efl.efreelearndao.entity.School;
import com.efl.efreelearndao.exception.ResourceNotFoundException;
import com.efl.efreelearndao.service.SchoolService;


import org.modelmapper.ModelMapper;


@RestController
@RequestMapping("/api/v1")
public class SchoolRestController {
	
	@Autowired
	private SchoolService schoolInfoService;

	@Autowired
    private ModelMapper modelMapper;
	
	@PostMapping("/schools")
	public SchoolInfoDTO createSchool(@Valid @RequestBody SchoolInfoDTO schoolInfoDTO) {
		School schoolInfo = convertToEntity(schoolInfoDTO);
		return convertToDto(schoolInfoService.createSchoolInfo(schoolInfo));
	}
	


	


	
	@GetMapping("/schools")
	public List<SchoolInfoDTO> getAllSchoolInfos() {
		List<School> schools = schoolInfoService.getAllSchoolInfos();
		return schools.stream()
        .map(this::convertToDto)
        .collect(Collectors.toList());
	}
	
	@GetMapping("/schools/{id}")
	public  ResponseEntity<SchoolInfoDTO>  getSchoolInfoById(@PathVariable(value = "id") Long schoolInfoId) {
		//Optional<SchoolInfo> schools = schoolInfoService.getSchoolInfoById(schoolInfoId);
		Optional<School> schools = schoolInfoService.getSchoolInfoById(schoolInfoId);
		SchoolInfoDTO dto =convertToDto(schools);
		return ResponseEntity.ok().body(dto);
	}
	

	
	private SchoolInfoDTO convertToDto(Optional<School> schools) {
		SchoolInfoDTO SchoolInfoDTO = modelMapper.map(schools, SchoolInfoDTO.class);
		
		return SchoolInfoDTO;
	}


@PutMapping("/Schools/{id}")
	public ResponseEntity<School> updateSchool(@PathVariable(value = "id") Long SchoolId,
			@Valid @RequestBody School SchoolDetails) throws ResourceNotFoundException {
		School school = schoolInfoService.getSchoolInfoById(SchoolId)
				.orElseThrow(() -> new ResourceNotFoundException("School not found for this id :: " + SchoolId));

		school.setEmail(SchoolDetails.getEmail());

		final School updatedSchool = schoolInfoService.updateSchoolInfo(SchoolDetails);
		return ResponseEntity.ok(updatedSchool);
	}

	@DeleteMapping("/Schools/{id}")
	public Map<String, Boolean> deleteSchool(@PathVariable(value = "id") Long SchoolId)
			throws ResourceNotFoundException {
		School School = schoolInfoService.getSchoolInfoById(SchoolId)
				.orElseThrow(() -> new ResourceNotFoundException("School not found for this id :: " + SchoolId));

		schoolInfoService.deleteSchoolInfo(School);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}


	public SchoolInfoDTO convertToDto(School SchoolInfo) {
		SchoolInfoDTO SchoolInfoDTO = modelMapper.map(SchoolInfo, SchoolInfoDTO.class);
		
		return SchoolInfoDTO;
	}
	
	public School convertToEntity(SchoolInfoDTO schoolInfoDTO) {
		School SchoolInfo = modelMapper.map(schoolInfoDTO, School.class);
		return SchoolInfo;
	}
	
}

