package org.example.sda_project.Service;

import org.example.sda_project.Bean.Module;
import org.example.sda_project.Repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public void addModule(Module module) {
        moduleRepository.save(module);
    }

    public Module getModuleById(Integer id) {
        return moduleRepository.findById(id).orElse(null);
    }

    public Module updateModule(Module module) {
        return moduleRepository.save(module);
    }

    public void deleteModule(Integer id) {
        moduleRepository.deleteById(id);
    }

    public List<Module> getAllModules() {
        return moduleRepository.findAll();
    }
}
