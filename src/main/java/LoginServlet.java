import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jef
 */
@WebServlet(name = "LoginServlet",urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginLoginServlet</title>");            
            out.println("<link rel=\"stylesheet\" href=\"css/main.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<nav>");
            out.println("<ul><li><a href='login.html'>Deslogar</a></li></ul>");
            out.println("</nav>");
            out.println("</header>");
            out.println("<main>");
            out.println("<section>");
            out.println("<h3>@WebServlet(name = \"LoginServlet\", urlPatterns = {\"/LoginServlet\"})</h3>");
            out.println("<h3>Usúario: "+request.getParameter("nome")+"</h3>");
            out.println("<h3>Senha: "+request.getParameter("senha")+"</h3>");
            out.println("</section>");
            out.println("</main>");
            out.println("<footer>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().print(""
                + "<script>"
                + "if(confirm('Este servlet só recebera requisições via POST, deseja logar-se?')){"
                + "location.href='login.html'"
                + "}else{"
                + "location.href='index.html'"
                + "}"
                + "</script>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
