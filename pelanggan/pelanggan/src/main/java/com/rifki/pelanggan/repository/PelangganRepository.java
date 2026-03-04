package com.rifki.pelanggan.repository;

import org.springframework.stereotype.Repository;
import com.rifki.pelanggan.model.Pelanggan;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PelangganRepository extends JpaRepository<Pelanggan, Long> {

}
