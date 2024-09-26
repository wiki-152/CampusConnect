package org.example.sda_project.Service;

import org.example.sda_project.Bean.Admin;
import org.example.sda_project.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public void addAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    public Admin getAdminById(Integer id) {
        return adminRepository.findById(id).orElse(null);
    }

    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Integer id) {
        adminRepository.deleteById(id);
    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
}
