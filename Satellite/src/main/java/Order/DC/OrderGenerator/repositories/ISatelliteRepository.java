package Order.DC.OrderGenerator.repositories;

import java.util.List;

import Order.DC.OrderGenerator.models.Satellite;

public interface ISatelliteRepository {
    boolean Add(Satellite sat);
    boolean Delete(int id);
    String Orbit();
    String Health();
    List<Satellite> GetAll();
}
