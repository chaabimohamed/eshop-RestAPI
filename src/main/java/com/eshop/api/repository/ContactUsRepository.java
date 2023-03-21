package com.eshop.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eshop.api.model.ContactUs;

public interface ContactUsRepository  extends JpaRepository<ContactUs,Long>{}