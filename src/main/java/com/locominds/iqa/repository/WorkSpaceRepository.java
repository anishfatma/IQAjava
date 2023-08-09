package com.locominds.iqa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locominds.iqa.entity.WorkSpace;
@Repository
public interface WorkSpaceRepository extends JpaRepository<WorkSpace, Long> {

}
