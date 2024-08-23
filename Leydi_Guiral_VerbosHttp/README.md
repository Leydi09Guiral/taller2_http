
DEFINICION DE:
* @RestController:  Indica que la clase es un controlador donde cada método se considera automáticamente 
                    como un método de respuesta a una solicitud HTTP.
* @RequestMapping("item"): Se utiliza para mapear solicitudes web a métodos específicos de un controlador. 
                          La ruta "/item" significa que las solicitudes HTTP a esta URL serán manejadas por métodos dentro de la clase anotada.
* @Autowired: Se utiliza para realizar la inyección automática de dependencias en Spring.
              Permite a Spring resolver y inyectar los objetos de las dependencias en el tiempo de ejecución.

Que hace el método que se encuentra en esta clase con el nombre de GroceryItem y para que sirve la etiqueta @Override?

La clase GroceryItem representa un artículo de comestibles en la aplicación. Contiene atributos como :
* id:  identificador único.
* name:  nombre del artículo.
* quantity: La cantidad disponible del artículo.
* category: La categoría a la que pertenece el artículo (frutas, verduras, etc.).

Etiqueta @Override:
Se utiliza para indicar que el método toString() en esta clase es una sobrescritura de un método definido en una clase base (en este caso, Object).

Que hace el GET, POST , DELETE, PATH, PUT y HEAD

* GET: Recupera información del servidor. Se utiliza para obtener datos de los recursos.
* POST: Envía datos al servidor para crear un nuevo recurso.
* DELETE: Elimina un recurso específico en el servidor.
* PUT: Actualiza un recurso existente en el servidor, reemplazando completamente el recurso.
* PATCH: Actualiza parcialmente un recurso existente en el servidor.
* HEAD: Es similar a GET, pero solo recupera los encabezados de la respuesta, sin el cuerpo.