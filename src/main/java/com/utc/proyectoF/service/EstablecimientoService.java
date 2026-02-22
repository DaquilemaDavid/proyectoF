package com.utc.proyectoF.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.utc.proyectoF.entity.Establecimiento;
import com.utc.proyectoF.repository.EstablecimientoRepository;

@Service
public class EstablecimientoService {

    @Autowired
    private EstablecimientoRepository repository;

    // Obtener todos los establecimientos
    public List<Establecimiento> listar() {
        return repository.findAll();
    }

    // Buscar un establecimiento por su ID (codigo_est)
    public Establecimiento buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Guardar o actualizar un establecimiento
    public Establecimiento guardar(Establecimiento establecimiento) {
        return repository.save(establecimiento);
    }

    // Eliminar un establecimiento
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}