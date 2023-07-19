package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CRMD")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private Integer id;
	@NotNull(message = "Firstname should not be null")
	private String firstName;
	@NotNull(message = "Lastname should not be null")
	private String lastName;
	@javax.validation.constraints.Email(message = "invalid email address")
	private String Email;

}
