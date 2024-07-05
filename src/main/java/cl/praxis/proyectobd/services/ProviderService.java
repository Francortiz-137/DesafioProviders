package cl.praxis.proyectobd.services;

import cl.praxis.proyectobd.models.ProviderDTO;

import java.sql.SQLException;
import java.util.List;

public interface ProviderService {
    public ProviderDTO selectProviderById(int id) throws SQLException;

    public List<ProviderDTO> selectAllProviders();

    public ProviderDTO insertProvider(ProviderDTO user);

    public ProviderDTO updateProvider(ProviderDTO user);

    public void deleteProvider(int id);

    ProviderDTO insertProvider(String name, String rut, String address, String email, String phone, String contact, String phoneContact);
}
