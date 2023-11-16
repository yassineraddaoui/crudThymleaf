package com.crudthymleaf.Services;

import com.crudthymleaf.Entites.Staff;

import java.util.List;

public interface StaffService {
        void save(Staff staff);
        List<Staff> getAll();
        Staff getById(Long id);
        void delete(Staff staff);


}
