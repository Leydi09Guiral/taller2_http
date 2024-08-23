package com.LeydiGuiral.Leydi_Guiral_VerbosHttp.Controller;

import com.LeydiGuiral.Leydi_Guiral_VerbosHttp.Model.GroceryItem;
import com.LeydiGuiral.Leydi_Guiral_VerbosHttp.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Obtener todos los items
    @GetMapping
    public List<GroceryItem> getAllItems() {
        return itemService.getAll();
    }

    // Insertar un nuevo item
    @PostMapping
    public ResponseEntity<GroceryItem> createItem(@RequestBody GroceryItem groceryItem) {
        GroceryItem createdItem = itemService.insert(groceryItem);
        return ResponseEntity.ok(createdItem);
    }

    // Actualizar un item existente
    @PutMapping("/{id}")
    public ResponseEntity<GroceryItem> updateItem(@PathVariable String id, @RequestBody GroceryItem groceryItem) {
        groceryItem.setId(id); // Asegúrate de establecer el ID en el objeto
        GroceryItem updatedItem = itemService.update(groceryItem);
        return ResponseEntity.ok(updatedItem);
    }

    // Eliminar un item
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable String id) {
        String response = itemService.delete(id);
        return ResponseEntity.ok(response);
    }

    // Actualizar parcialmente un item
    @PatchMapping("/{id}")
    public ResponseEntity<String> patchItem(@PathVariable String id, @RequestBody GroceryItem groceryItem) {
        String response = itemService.updateData(id, groceryItem);
        return ResponseEntity.ok(response);
    }

    // Opciones de actualización
    @GetMapping("/options")
    public String optionsUpdate() {
        return itemService.optionsUpdate();
    }
}

