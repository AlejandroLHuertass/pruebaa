package edu.eci.cvds.servlet;
	import edu.eci.cvds.servlet.model.Todo;

	import java.util.ArrayList;
	import java.io.IOException;
	import java.io.Writer;
	import java.util.Optional;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import java.io.FileNotFoundException;
	import java.lang.NumberFormatException;
	
	@WebServlet(
		urlPatterns = "/accessToServlet"
	)
	
	public class LabServlet extends HttpServlet{
		static final long serialVersionUID = 35L;
		
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Writer responseWriter = resp.getWriter();
			Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
			try{
				int id = optId.isPresent() && !optId.get().isEmpty() ? Integer.parseInt(optId.get()) : 0;
				resp.setStatus(HttpServletResponse.SC_OK);
				ArrayList<Todo> todo = new ArrayList<Todo>();
				todo.add(Service.getTodo(id));
				responseWriter.write(Service.todosToHTMLTable(todo));
			}catch (FileNotFoundException e){
				resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_NOT_FOUND));
			}catch (NumberFormatException e){
				resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_BAD_REQUEST));
			}catch (Exception e){
				resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_INTERNAL_SERVER_ERROR));
			}
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
			Writer responseWriter = resp.getWriter();
			Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
			try{
				int id = optId.isPresent() && !optId.get().isEmpty() ? Integer.parseInt(optId.get()) : 0;
				resp.setStatus(HttpServletResponse.SC_OK);
				ArrayList<Todo> todo = new ArrayList<Todo>();
				todo.add(Service.getTodo(id));
				responseWriter.write(Service.todosToHTMLTable(todo));
			}catch (FileNotFoundException e){
				resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_NOT_FOUND));
			}catch (NumberFormatException e){
				resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_BAD_REQUEST));
			}catch (Exception e){
				resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				responseWriter.write(Service.errorToHTML(HttpServletResponse.SC_INTERNAL_SERVER_ERROR));
			}
		}
}