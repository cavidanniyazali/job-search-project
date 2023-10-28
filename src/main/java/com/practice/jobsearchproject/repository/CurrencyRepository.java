package com.practice.jobsearchproject.repository;

import com.practice.jobsearchproject.model.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
    Currency findCurrencyById(Integer id);
}

