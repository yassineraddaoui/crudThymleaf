package com.crudthymleaf.Repos;

import com.crudthymleaf.Entites.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staff,Long> {

}
