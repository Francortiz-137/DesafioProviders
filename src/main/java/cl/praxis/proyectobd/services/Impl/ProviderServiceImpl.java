package cl.praxis.proyectobd.services.Impl;

import cl.praxis.proyectobd.DAO.Impl.ProviderDAOImpl;
import cl.praxis.proyectobd.DAO.ProviderDAO;
import cl.praxis.proyectobd.models.ProviderDTO;
import cl.praxis.proyectobd.services.ProviderService;

import java.sql.SQLException;
import java.util.List;

public class ProviderServiceImpl implements ProviderService {

    private final ProviderDAO dao;

    public ProviderServiceImpl() {
        dao = new ProviderDAOImpl();
    }

    @Override
    public ProviderDTO selectProviderById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<ProviderDTO> selectAllProviders() {
        return dao.selectAllProviders();
    }

    @Override
    public ProviderDTO insertProvider(ProviderDTO user) {
        return null;
    }


    @Override
    public ProviderDTO updateProvider(ProviderDTO user) {
        return null;
    }

    @Override
    public void deleteProvider(int id) {

    }

    @Override
    public ProviderDTO insertProvider(String name, String rut, String address, String email, String phone, String contact, String contactPhone) {
        ProviderDTO dto = dao.insertProvider( new ProviderDTO(name,rut,address,email,phone,contact,contactPhone));
        return dto;
    }
}
