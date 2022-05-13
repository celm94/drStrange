package Factory;

import Heroe.Heroe;
import Villano.Villano;

public interface AbstractFactory {
    public Heroe getHeroe();
    public Villano getVillano();
}
