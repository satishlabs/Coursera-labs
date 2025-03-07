import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeePayrollServlet
 */
@WebServlet("/employeepayroll")
public class employeepayroll extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public employeepayroll() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        int hours = Integer.parseInt(request.getParameter("hours"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double federal = Double.parseDouble(request.getParameter("federal"));
        double state = Double.parseDouble(request.getParameter("state"));

        double grossPay = rate * hours;
        double federalTax = (federal / 100) * grossPay;
        double stateTax = (state / 100) * grossPay;
        double deduction = federalTax + stateTax;
        double netPay = grossPay - deduction;

        out.println("<html><head><title>Employee Payroll</title></head><body>");
        out.println("<h2>Employee Payroll Details</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Attribute</th><th>Value</th></tr>");
        out.println("<tr><td>Name</td><td>" + name + "</td></tr>");
        out.println("<tr><td>Hours Worked</td><td>" + hours + "</td></tr>");
        out.println("<tr><td>Hourly Rate</td><td>" + rate + "</td></tr>");
        out.println("<tr><td>Federal Tax (%)</td><td>" + federal + "</td></tr>");
        out.println("<tr><td>State Tax (%)</td><td>" + state + "</td></tr>");
        out.println("<tr><td>Gross Pay</td><td>" + grossPay + "</td></tr>");
        out.println("<tr><td>Total Deduction</td><td>" + deduction + "</td></tr>");
        out.println("<tr><td>Net Pay</td><td>" + netPay + "</td></tr>");
        out.println("</table>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
