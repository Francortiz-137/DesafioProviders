package cl.praxis.proyectobd;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "managerServlet", value = "/manager")
public class ManagerServlet extends HttpServlet {
    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nombre = request.getParameter("nombre");
        String rut = request.getParameter("rut");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String contacto = request.getParameter("contacto");
        String telefono_contacto = request.getParameter("telefono_contacto");

        // Validar que los campos requeridos no sean null o vacíos
        if (nombre == null || nombre.isEmpty() ||
                rut == null || rut.isEmpty() ||
                direccion == null || direccion.isEmpty() ||
                correo == null || correo.isEmpty()) {
            response.sendRedirect("providers.jsp");
            return;
        }
    }

    public void destroy() {
    }
}
