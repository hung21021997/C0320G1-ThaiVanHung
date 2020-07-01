package com.codegym.demo.repository;

import com.codegym.demo.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {

    List<Province> findAllByIsDeleteIsFalse();
}
