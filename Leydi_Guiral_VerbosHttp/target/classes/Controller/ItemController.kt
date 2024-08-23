
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.LeydiGuiral.model.GroceryItem;



@Autowired
var itemService: ItemService? = null

// 1. metodo de ejemplo para verbo GET
@GetMapping("/getAll")
fun getAll(): String {
    return itemService.getAll()
}

// 2. metodo de ejemplo para verbo POST
@PostMapping("/insert")
fun insert(@RequestBody groceryItem: GroceryItem?): String {
    return itemService.insert(groceryItem)
}

// 3. metodo de ejemplo para verbo UPDATE
@PutMapping("/update")
fun update(@RequestBody groceryItem: GroceryItem?): String {
    return itemService.update(groceryItem)
}

// 4. metodo de ejemplo para verbo DELETE
@DeleteMapping("/delete/{id}")
fun deleteItem(@PathVariable("id") id: String?): String {
    return itemService.delete(id)
}

// 5. metodo de ejemplo para verbo PATH
@PatchMapping("/updateData/{id}")
fun updateData(@PathVariable id: String?, @RequestBody groceryItem: GroceryItem?): String {
    return itemService.updateData(id, groceryItem)
}

// 6. metodo de ejemplo para verbo HEAD
@RequestMapping(value = ["/getAll"], method = [RequestMethod.HEAD])
fun handleHeadRequest(): ResponseEntity<*> {
    val headers: HttpHeaders = HttpHeaders()
    headers.setContentType(MediaType.APPLICATION_JSON)
    return ResponseEntity<Any>(headers, HttpStatus.OK)
}