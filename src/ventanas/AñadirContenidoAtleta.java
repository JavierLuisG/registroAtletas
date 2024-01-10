package ventanas;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Esta clase va a heredar Object... para dar solucion a añadir texto en el
 * archivo binario
 */
public class AñadirContenidoAtleta extends ObjectOutputStream {

    // método del constructor
    public AñadirContenidoAtleta(OutputStream out) throws IOException {
        super(out);
    }

    // método del constructor
    public AñadirContenidoAtleta() throws IOException, SecurityException {
    }

    /**
     * Este método se llama para escribir una cabecera especial en el flujo de
     * salida. La cabecera generalmente contiene información específica del
     * formato del flujo. Al sobrescribir este método, se puede personalizar
     * cómo se escribe la cabecera en la implementación.
     */
    @Override
    public void writeStreamHeader() throws IOException {
        // se verifica que el archivo está o no vacio
        File archivo = new File("registros.bin");
        if (archivo.length() == 0) {
            // si está vacio se pone cabecera al inicio            
            super.writeStreamHeader();
        } else {
            // garantiza que no se almacene ninguna referencia duplicada de objetos serializados
            reset();
        }
    }
}
