package com.cg.ucaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ucaa.exception.LoginFailedException;
import com.cg.ucaa.models.LoginModel;
import com.cg.ucaa.service.ILoginService;

/**
 * Controller class to facilitate operations
 * @author Akshat Kumar
 *
 */
@RestController
@RequestMapping("/logins")
public class LoginRestController {

	@Autowired
	private ILoginService loginService;

	/**
	 * Validating login as an Applicant
	 * @param loginId
	 * @return
	 */
	@GetMapping("/applicant/{loginId}")
	public ResponseEntity<String> loginAsApplicant(@PathVariable("loginId") Long loginId) throws LoginFailedException {
		LoginModel entity = new LoginModel();
		entity.setLoginId(loginId);
		String validApplicant = loginService.loginAsApplicant(entity);
		return new ResponseEntity<>(validApplicant, HttpStatus.OK);
	}

	/**
	 * Validating login as University Staff Member
	 * @param loginId
	 * @return
	 */
	@GetMapping("/universitystaffs/{loginId}")
	public ResponseEntity<String> loginAsUniversityStaff(@PathVariable("loginId") Long loginId)
			throws LoginFailedException {
		LoginModel entity = new LoginModel();
		entity.setLoginId(loginId);
		String validStaff = loginService.loginAsUniversityStaffMember(entity);
		return new ResponseEntity<>(validStaff, HttpStatus.OK);
	}

	/**
	 * Validating login as Admission Committee Member
	 * @param loginId
	 * @return
	 */
	@GetMapping("/commiteemember/{loginId}")
	public ResponseEntity<String> loginAsAdmissionCommiteeMember(@PathVariable("loginId") Long loginId)
			throws LoginFailedException {
		LoginModel entity = new LoginModel();
		entity.setLoginId(loginId);
		String validMember = loginService.loginAsAdmissionCommiteeMember(entity);
		return new ResponseEntity<>(validMember, HttpStatus.OK);
	}

}