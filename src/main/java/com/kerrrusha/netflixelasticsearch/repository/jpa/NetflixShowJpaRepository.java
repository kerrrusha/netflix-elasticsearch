package com.kerrrusha.netflixelasticsearch.repository.jpa;

import com.kerrrusha.netflixelasticsearch.domain.NetflixShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NetflixShowJpaRepository extends JpaRepository<NetflixShow, String> {
}
