package com.rs.springframework.repositories;

import com.rs.springframework.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * created by rs 3/2/2022.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
