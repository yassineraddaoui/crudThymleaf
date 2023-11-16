package com.crudthymleaf.Controllers;

import com.crudthymleaf.Entites.Staff;
import com.crudthymleaf.Services.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StaffController {

    final private StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/get-all-staff")
    public String getAllStaff(Model model) {
        List<Staff> allStaff = staffService.getAll();
        if (!allStaff.isEmpty()) {
            model.addAttribute("staffs", allStaff);
        }
        return "list-staffs";
    }

    @GetMapping("/add-staff")
    public String addStaff(Model model) {
        model.addAttribute("staff", new Staff());
        return "add-edit-staff";
    }

    @PostMapping("/save-staff")
    public String saveStaff(Staff staff) {
        staffService.save(staff);
        return "redirect:/";
    }

    @GetMapping("/staff-update/{id}")
    public String getStaff(Model model, @PathVariable("id") Long id) {
        Staff staff = staffService.getById(id);
        model.addAttribute("staff", staff);
        return "add-edit-staff";
    }

    @GetMapping("/staff-delete/{id}")
    public String deleteStaff(@PathVariable("id") Long id) {
        Staff deleteStaff = staffService.getById(id);
        staffService.delete(deleteStaff);
        return "redirect:/";
    }

}
