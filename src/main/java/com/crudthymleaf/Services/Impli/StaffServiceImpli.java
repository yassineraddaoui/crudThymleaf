package com.crudthymleaf.Services.Impli;

import com.crudthymleaf.Entites.Staff;
import com.crudthymleaf.Repos.StaffRepo;
import com.crudthymleaf.Services.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffServiceImpli implements StaffService {
    private StaffRepo staffRepo;

    public StaffServiceImpli(StaffRepo staffRepo) {
        this.staffRepo = staffRepo;
    }

    @Override
    public void save(Staff staff) {
        staffRepo.save(staff);
    }

    @Override
    public List<Staff> getAll() {
        return staffRepo.findAll();
    }

    @Override
    public Staff getById(Long id) {
        return staffRepo.findById(id).orElseThrow();
    }

    @Override
    public void delete(Staff staff) {
        staffRepo.delete(staff);
    }
}
