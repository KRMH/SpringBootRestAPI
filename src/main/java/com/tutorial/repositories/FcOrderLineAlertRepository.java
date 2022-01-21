package com.tutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.models.FcOrderLineAlert;

public interface FcOrderLineAlertRepository extends JpaRepository<FcOrderLineAlert, Long> {

}
