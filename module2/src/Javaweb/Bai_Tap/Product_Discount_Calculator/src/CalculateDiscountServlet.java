import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", urlPatterns = "/display-discount")
public class CalculateDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        float discountAmount = listPrice*discountPercent*0.1f;
        float discountPrice = listPrice-discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Giá niêm yết: " + listPrice + "</br>");
        writer.println("Tỷ lệ chiết khấu: " + discountPercent + "</br>");
        writer.println("Lượng chiết khấu: " + discountAmount + "</br>");
        writer.println("Giá sau chiết khấu: " + discountPrice + "</br>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
