package com.utc.proyectoF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.utc.proyectoF.entity.Cargo;
import com.utc.proyectoF.service.CargoService;

@Controller
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoService cargoService;

    // ==============================
    // LISTAR CARGOS
    // ==============================
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cargos", cargoService.listar());
        return "cargos/cargos";
    }

    // ==============================
    // FORMULARIO NUEVO CARGO
    // ==============================
    @GetMapping("/nuevo")
    public String formularioNuevo(Model model) {
        model.addAttribute("cargo", new Cargo());
        return "cargos/cargosC";
    }

    // ==============================
    // FORMULARIO EDITAR CARGO
    // ==============================
    @GetMapping("/editar/{id}")
    public String formularioEditar(@PathVariable Long id, Model model) {
        model.addAttribute("cargo", cargoService.buscarPorId(id));
        return "cargos/editarC";
    }

    // ==============================
    // GUARDAR CARGO
    // ==============================
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("cargo") Cargo cargo,
                          RedirectAttributes attribute) {
        try {
            cargoService.guardar(cargo);
            attribute.addFlashAttribute("success", "Cargo guardado correctamente.");
        } catch (Exception e) {
            attribute.addFlashAttribute("error", "Error al guardar el cargo. Verifique los datos.");
        }
        return "redirect:/cargos";
    }

    // ==============================
    // ELIMINAR CARGO
    // ==============================
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id,
                           RedirectAttributes attribute) {
        try {
            cargoService.eliminar(id);
            attribute.addFlashAttribute("success", "Cargo eliminado correctamente.");
        } catch (Exception e) {
            attribute.addFlashAttribute("error", "No se pudo eliminar. Puede estar relacionado con otras tablas.");
        }
        return "redirect:/cargos";
    }
}