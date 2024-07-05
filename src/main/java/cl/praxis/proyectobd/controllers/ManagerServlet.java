package cl.praxis.proyectobd.controllers;

import cl.praxis.proyectobd.models.ProviderDTO;
import cl.praxis.proyectobd.services.Impl.ProviderServiceImpl;
import cl.praxis.proyectobd.services.ProviderService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "proveedores", value = "/proveedores")
public class ManagerServlet extends HttpServlet {
    ProviderService provider = new ProviderServiceImpl();

    public void init() throws ServletException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       listUsers(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        insertUser(request, response);
    }

    public void destroy() {
    }

    // Método para listar todos los usuarios
    private void listUsers(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<ProviderDTO> listProviders = provider.selectAllProviders();
        System.out.println(listProviders);
        request.setAttribute("listProviders", listProviders);
        request.getRequestDispatcher("provider-list.jsp").forward(request, response);
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String name = request.getParameter("nombre");
        String rut = request.getParameter("rut");
        String address = request.getParameter("direccion");
        String email = request.getParameter("correo");
        String phone = request.getParameter("telefono");
        String contact = request.getParameter("contacto");
        String contactPhone = request.getParameter("telefono_contacto");

        // Validar que los campos requeridos no sean null o vacíos
        if (name == null || name.isEmpty() ||
                rut == null || rut.isEmpty() ||
                address == null || address.isEmpty() ||
                email == null || email.isEmpty()) {
            response.sendRedirect("form.jsp");
            return;
        }

        ProviderDTO newProvider = provider.insertProvider(name,rut,address,email,phone,contact,contactPhone);
        listUsers(request, response);
    }
}
