package com.kerrrusha.netflixelasticsearch.service;

import com.kerrrusha.netflixelasticsearch.domain.NetflixShow;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NetflixShowSearchService {
    Page<NetflixShow> searchByTitle(String title, Pageable pageable);
}
