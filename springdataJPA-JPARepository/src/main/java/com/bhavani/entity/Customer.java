package com.bhavani.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NonNull;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "CNO_SEQ", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Column(name = "CID")
	private Integer cno;
	@NonNull
	@Column(name = "CNAME", length = 25)
	private String cname;
	@NonNull
	@Column(name = "CADD", length = 20)
	private String cadd;
	@Column(name = "BILLAMT")
	private Float billAmt;

	/*
	 * public Customer(int i, String string, String string2, float f) { // TODO }
	 */
	 

	/*
	 * public Customer(Integer cno, String cname, String cadd, Float billAmt) {
	 * super(); this.cno = cno; this.cname = cname; this.cadd = cadd; this.billAmt =
	 * billAmt; }
	 */

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}

	public Float getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(Float billAmt) {
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", cadd=" + cadd + ", billAmt=" + billAmt + "]";
	}

}
