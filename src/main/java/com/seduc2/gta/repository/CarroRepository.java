package com.seduc2.gta.repository;

import com.seduc2.gta.entity.Arma;
import com.seduc2.gta.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
