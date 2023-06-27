package com.xworkz.facebook.service;

import java.sql.ResultSet;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.facebook.dto.FacebookDto;
import com.xworkz.facebook.repo.RepoImp;
import com.xworkz.facebook.repo.Repository;

public class ServiceImp implements Superfacebook {
	Repository repo = new RepoImp();
	FacebookDto[] face = new FacebookDto[20];

	public boolean ValidateSave(FacebookDto dto) throws Exception {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FacebookDto>> violation = validator.validate(dto);

		if (violation.isEmpty()) {
			if (dto.getPhoneNo() == 10) {
				boolean saving = repo.save(dto);
				System.out.println(saving);
			}

			else {
				System.out.println("phonenumber not valid");
			}
		} else {
			System.out.println("error");
			System.out.println(violation);
		}

		return false;
	}

	@Override
	public ResultSet readDto(FacebookDto dto) throws Exception {
		ResultSet reading = repo.read(dto);
		System.out.println(reading);
		return null;
	}

	@Override
	public boolean update(String mail, int id) throws Exception {
		boolean updating = repo.update(mail, id);
		System.out.println(updating);
		return false;
	}

	@Override
	public boolean Deleting(String mail) throws Exception {
		boolean remove = repo.delete(mail);
		System.out.println(remove);
		return false;
	}

	@Override
	public ResultSet readDto01(FacebookDto dto, String mail) throws Exception {
		ResultSet reading01 = repo.readbymail(dto, mail);
		System.out.println(reading01);
		return null;
	}

	@Override
	public boolean update01(FacebookDto dto, String mail, String firstname, String lastname, String DOB, int id)
			throws Exception {
		boolean updated = repo.update(dto, mail, firstname, lastname, DOB, id);
		return false;
	}

	@Override
	public boolean delete01(int id) throws Exception {
		boolean remove = repo.delete01(id);
		System.out.println(remove);
		 
		return false;
	}

}
