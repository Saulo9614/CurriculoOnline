package servlets;

import com.sun.net.httpserver.Filter;
import java.io.File;
import java.io.FileInputStream;
import model.Curriculo;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GerarPDF;

@WebServlet(name = "GeradorDePDF", urlPatterns = {"/cadastro"})
public class GeradorDePDF extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        request.setCharacterEncoding("UTF-8");

        //conteudo dos campos
        //dados pessoais
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("end");
        String nacionalidade = request.getParameter("nacion");
        String estadoCiv = request.getParameter("estadoCiv");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String telefone = request.getParameter("fone");
        String email = request.getParameter("email");
        String objetivo = request.getParameter("objt");
        //formacao academica
        String instituicao = request.getParameter("instituicao");
        String status = request.getParameter("status");
        String periodo = request.getParameter("periodo");
        String formacoes = request.getParameter("formacoes");
        //esperiencias profissionais
        String funcao = request.getParameter("funcao");
        String empresa = request.getParameter("empresa");
        String periodoEP = request.getParameter("periodoEP");
        String experiencias = request.getParameter("experiencias");
        //cursos extracurriculares
        String instituicaoEC = request.getParameter("instituicaoEC");
        String cursoEC = request.getParameter("cursoEC");
        String periodoEC = request.getParameter("periodoEC");
        String cursosExtrasEC = request.getParameter("cursosExtrasEC");

        Curriculo curriculo = new Curriculo(nome, endereco, nacionalidade, estadoCiv, cidade, estado, telefone, email, objetivo, instituicao, status, periodo, formacoes, funcao, empresa, periodoEP, experiencias, instituicaoEC, cursoEC, periodoEC, cursosExtrasEC);
        GerarPDF.gerarPDF(curriculo);

        /* TODO output your page here. You may use following sample code. */
        response.setContentType("application/pdf");

        // Make sure to show the download dialog
        response.setHeader("Content-disposition", "attachment; filename=curriculo.pdf");

        // Assume file name is retrieved from database
        // For example D:\\file\\test.pdf
        File my_file = new File("C:\\Users\\Saulo Alves\\Documents\\NetBeansProjects\\MinhaAplicacaoWeb\\PDF GERADO\\curriculo.pdf");

        // This should send the file to browser
        OutputStream out = response.getOutputStream();
        FileInputStream in = new FileInputStream(my_file);
        byte[] buffer = new byte[4096];
        int length;
        while ((length = in.read(buffer)) > 0) {
            out.write(buffer, 0, length);
        }
        in.close();
        out.flush();

        //CODIGO PARA GERAR PDF
    }

}
