package net.javaguides.springboot.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "appointments")
public class Appointment {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	@Column(name = "doctor_id")
	private Long doctorId;
	@Column(name = "doctor_name")
	private String doctor_name;
	@Column(name = "person_id")
	private Long personId;
	@Column(name = "person_name")
	private String person_name;
	@Column(name = "fee")
	private Long fee;
	@Column(name="appointment_dt")
	private String date;
	@Column(name = "appointment_tm")
	private Long time;
	@Column (name= "appointment_detail")
	private String details;
	public Appointment(Long id, Long doctor_id, String doctor_name, Long personId, String person_name, Long fee,
			String date,Long time,String details) {
		super();
		this.id = id;
		this.doctorId = doctor_id;
		this.doctor_name = doctor_name;
		this.personId = personId;
		this.person_name = person_name;
		this.fee = fee;
		this.date=date;
		this.time = time;
		this.details=details;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDoctor_id() {
		return doctorId;
	}
	public void setDoctor_id(Long doctor_id) {
		this.doctorId = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public String getDetail() {
		return this.details;
	}
	
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public Long getPerson_id() {
		return personId;
	}
	public void setPerson_id(Long person_id) {
		this.personId = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public Long getFee() {
		return fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDetail(String detail) {
		this.details = detail;
	}
	

}
