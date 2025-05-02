package com.example.firstSpringboot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StaffService {
    private final Map<Long, StaffClass> staffMap = new HashMap<>();

    public List<StaffClass> getAllStaffs() {
        return new ArrayList<>(staffMap.values());
    }

    public StaffClass getStaff(Long id) {
        return staffMap.get(id);
    }

    public StaffClass createStaff(StaffClass staff) {
        staffMap.put(staff.getId(), staff);
        return staff;
    }

    public StaffClass updateStaff(Long id, StaffClass updatedStaff) {
        staffMap.put(id, updatedStaff);
        return updatedStaff;
    }

    public void deleteStaff(Long id) {
        staffMap.remove(id);
    }
}


