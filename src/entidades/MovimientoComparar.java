package entidades;
import java.util.*;

/**
 *
 * @author Celeste
 */
public class MovimientoComparar implements Comparator<Movimiento> {
    
    @Override
    public int compare(Movimiento movimiento1, Movimiento movimiento2) {
        return movimiento1.getCuenCodigo().compareToIgnoreCase(movimiento2.getCuenCodigo());
    }  
    
}