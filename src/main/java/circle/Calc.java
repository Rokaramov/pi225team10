package circle;

import java.io.IOException;
import java.math.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Calc", urlPatterns="/Calc")

public class Calc extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		
		request.getRequestDispatcher("/Results.jsp").forward(request, response);
	}
	
	private static class RequestCalc {
		private  String first_calc = new String();
		private  String second_calc = new String();
		private Double result;
	
		
		private RequestCalc (String first, String second) {
			this.first_calc = first;
			this.second_calc = second;
		}
		
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(
					request.getParameter("first"), 
					request.getParameter("second"));
		}
		
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
			request.setAttribute("first", first_calc);
			request.setAttribute("second", second_calc);
			double first_try;
			double second_try;
			try {
				first_try=Double.parseDouble(first_calc);
				second_try=Double.parseDouble(second_calc);
			}
			catch (NumberFormatException e) {
				first_try=0;
				second_try=0;
			}
			Schet sch = new Schet(Math.PI, first_try, second_try);
			result = sch.getSum();
			request.setAttribute("result", result);
		}
	}
}
