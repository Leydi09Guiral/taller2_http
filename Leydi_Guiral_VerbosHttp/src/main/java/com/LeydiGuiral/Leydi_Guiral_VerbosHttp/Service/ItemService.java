package com.LeydiGuiral.Leydi_Guiral_VerbosHttp.Service;

import com.LeydiGuiral.Leydi_Guiral_VerbosHttp.Model.GroceryItem;
import com.LeydiGuiral.Leydi_Guiral_VerbosHttp.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    // Obtener todos los elementos
    public List<GroceryItem> getAll() {
        return repository.findAll();
    }

    // Insertar un nuevo elemento
    public GroceryItem insert(GroceryItem groceryItem) {
        return repository.save(groceryItem);
    }

    // Actualizar un elemento existente
    public GroceryItem update(GroceryItem groceryItem) {
        return repository.save(groceryItem);
    }

    // Eliminar un elemento por ID
    public String delete(String id) {
        Optional<GroceryItem> item = repository.findById(id);
        if (item.isPresent()) {
            repository.deleteById(id);
            return "---ITEM ELIMINADO---";
        }
        return "---ITEM NO ENCONTRADO---";
    }

    // Actualizar parcialmente un elemento
    public String updateData(String id, GroceryItem groceryItem) {
        Optional<GroceryItem> itemOptional = repository.findById(id);
        if (itemOptional.isPresent()) {
            GroceryItem item = itemOptional.get();
            if (groceryItem.getName() != null) {
                item.setName(groceryItem.getName());
            }
            if (groceryItem.getCategory() != null) {
                item.setCategory(groceryItem.getCategory());
            }
            repository.save(item);
            return "---ITEM ACTUALIZADO---\n" + item.toString();
        }
        return "---ITEM NO ENCONTRADO---";
    }

    // Opciones de actualización
    public String optionsUpdate() {
        return "OPTIONS: It insert a new grocery item, if the grocery item doesn't exist, it will create automatically";
    }
}
