package com.tutorial.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="FC_ORDER_LINE_ALERT")
public class FcOrderLineAlert {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	//@Column(name="ORDER_LINE_ID")
	//private Long orderLineId;
	
	@Column(name="ALERT_ID")
	private Long alertId;
	@JsonBackReference
	@ManyToOne (fetch = FetchType.LAZY, optional = false)
	@JoinColumn (name = "orderLineId", referencedColumnName="id")
	private MolMain molMain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public Long getOrderLineId() {
//		return orderLineId;
//	}
//
//	public void setOrderLineId(Long orderLineId) {
//		this.orderLineId = orderLineId;
//	}

	public Long getAlertId() {
		return alertId;
	}

	public void setAlertId(Long alertId) {
		this.alertId = alertId;
	}

	public MolMain getMolMain() {
		return molMain;
	}

	public void setMolMain(MolMain molMain) {
		this.molMain = molMain;
	} 
	
}
