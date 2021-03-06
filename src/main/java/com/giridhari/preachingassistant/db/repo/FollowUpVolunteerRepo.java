package com.giridhari.preachingassistant.db.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.giridhari.preachingassistant.db.model.FollowUpVolunteer;;

@Repository
public interface FollowUpVolunteerRepo extends PagingAndSortingRepository<FollowUpVolunteer, Long>{

}
