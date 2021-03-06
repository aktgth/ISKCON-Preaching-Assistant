package com.giridhari.preachingassistant.db.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.giridhari.preachingassistant.db.model.FollowUpAssignment;

@Repository
public interface FollowUpAssignmentRepo extends PagingAndSortingRepository<FollowUpAssignment, Long> {
	
}