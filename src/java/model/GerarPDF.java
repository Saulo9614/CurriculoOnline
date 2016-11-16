package model;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zefelix
 */
public class GerarPDF {
    
    
    public static void gerarPDF(Curriculo currilo){
       
        FontFactory.register("C:\\Windows\\Fonts\\arial.ttf");			
        Font fonteLote = new Font(FontFactory.getFont("arial"));
        fonteLote.setSize(8);
        fonteLote.setColor(BaseColor.BLACK);
        fonteLote.setStyle(RtfParagraphStyle.STYLE_BOLD);
        // Fonte para a Descriçao 
	FontFactory.register("C:\\Windows\\Fonts\\arial.ttf");			
        Font fonteDescricao = new Font(FontFactory.getFont("arial"));
        fonteDescricao.setSize(8);
        fonteDescricao.setColor(BaseColor.BLACK);		

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Saulo Alves\\Documents\\NetBeansProjects\\MinhaAplicacaoWeb\\PDF GERADO\\curriculo.pdf"));
            document.open();
            document.add(new Paragraph("Dados Pessoais"));
            document.add(new Paragraph(currilo.getNome()));
            document.add(new Paragraph(currilo.getEndereco()));
            document.add(new Paragraph(currilo.getNacionalidade()));
            document.add(new Paragraph(currilo.getEstadoCiv()));
            document.add(new Paragraph(currilo.getCidade()));
            document.add(new Paragraph(currilo.getEstado()));
            document.add(new Paragraph(currilo.getTelefone()));
            document.add(new Paragraph(currilo.getEmail()));
            document.add(new Paragraph(currilo.getObjetivo()));
            
                       
         
        } catch (DocumentException doc) {
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            document.close();
        }
        
    }
    
}
