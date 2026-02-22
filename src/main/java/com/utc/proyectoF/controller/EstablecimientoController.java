package com.utc.proyectoF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.utc.proyectoF.entity.Establecimiento;
import com.utc.proyectoF.service.EstablecimientoService;

@Controller
@RequestMapping("/establecimientos")
public class EstablecimientoController {

    @Autowired
    private EstablecimientoService establecimientoService;

    // Listado de Establecimientos
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("establecimientos", establecimientoService.listar());
        return "establecimientos/listaE"; 
    }

    // Formulario para Nuevo Establecimiento
    @GetMapping("/nuevo")
    public String formularioNuevo(Model model) {
        model.addAttribute("establecimiento", new Establecimiento());
        return "establecimientos/crearE"; 
    }

    // Formulario para Editar Establecimiento
    @GetMapping("/editar/{id}")
    public String formularioEditar(@PathVariable Long id, Model model) {
        model.addAttribute("establecimiento", establecimientoService.buscarPorId(id));
        return "establecimientos/editarE";
    }

    // Guardar Establecimiento
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("establecimiento") Establecimiento establecimiento, RedirectAttributes attribute) {
        try {
            establecimientoService.guardar(establecimiento);
            attribute.addFlashAttribute("success", "Establecimiento guardado correctamente.");
        } catch (Exception e) {
            attribute.addFlashAttribute("error", "Error al guardar el establecimiento. Verifique los datos.");
        }
        return "redirect:/establecimientos";
    }

    // Eliminar Establecimiento
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id, RedirectAttributes attribute) {
        try {
            establecimientoService.eliminar(id);
            attribute.addFlashAttribute("success", "Establecimiento eliminado correctamente.");
        } catch (Exception e) {
            attribute.addFlashAttribute("error", "No se pudo eliminar. Es posible que tenga cargos asociados.");
        }
        return "redirect:/establecimientos";
    }
}