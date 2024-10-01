package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Nominee;
import com.velocity.repository.NomineeRepository;
import com.velocity.service.NomineeService;
@Service
public class NomineeServiceImpl implements NomineeService{

	@Autowired
	private NomineeRepository nomineeRepository;
	@Override
	public Nominee saveNominee(Nominee nominee) {
		Nominee nominee2 =nomineeRepository.save(nominee);
		return nominee2;
	}

}
