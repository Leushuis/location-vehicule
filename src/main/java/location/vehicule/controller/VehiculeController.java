
/*
package location.vehicule.controller;

import location.vehicule.model.Vehicule;
import location.vehicule.repository.VehiculeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/vehicules")
public class VehiculeController {

    private final VehiculeRepository vehiculeRepository;

    public VehiculeController(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    // 🔹 GET : tous les véhicules
    @GetMapping
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }

    // 🔹 GET : un véhicule par id
    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicule not found"));
    }

    // 🔹 POST : créer un véhicule
    @PostMapping
    public Vehicule createVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    // 🔹 DELETE : supprimer un véhicule
    @DeleteMapping("/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeRepository.deleteById(id);
    }
}

 */

