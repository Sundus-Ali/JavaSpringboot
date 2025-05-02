package com.example.firstSpringboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping()
    public Collection<StaffClass> getAll() {
        return staffService.getAllStaffs();
    }

    @GetMapping("/{id}")
    public StaffClass getById(@PathVariable Long id) {
        return staffService.getStaff(id);
    }

    @PostMapping("/staff")
    public StaffClass create(@RequestBody StaffClass staff) {
        return staffService.createStaff(staff);
    }



    @PutMapping("/{id}")
    public StaffClass update(@PathVariable Long id, @RequestBody StaffClass staff) {
        return staffService.updateStaff(id, staff);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        staffService.deleteStaff(id);
        return ResponseEntity.noContent().build();
    }
}
