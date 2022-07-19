package br.impacta.view.service;

import java.awt.Desktop;
//import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.x.protobuf.MysqlxExpr.DocumentPathItemOrBuilder;
import com.mysql.cj.xdevapi.Table;



import br.impacta.model.Gerente;
import br.impacta.repository.RepositorioGerente;

public class GerarPDF {

	RepositorioGerente repositorioGerente = new RepositorioGerente();
	
	public static void gerarPdfGerente() {
		RepositorioGerente repositorioGerente = new RepositorioGerente();
		Document doc = new Document();
		float fntSize, lineSpacing;
		fntSize = 6.7f;
		lineSpacing = 10f;
		String arquivoPdf = "ListaGerente.pdf";
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(arquivoPdf));
			doc.open();
			Paragraph paragrafo = new Paragraph();
			paragrafo.setAlignment(1);
			doc.add(paragrafo);
			
			Image image = Image.getInstance("imagens/logo.png");
			image.setAlignment(1);
			image.scaleToFit(200, 200);
			doc.add(image);
			
			
			
			paragrafo = new Paragraph("Lista de Gerentes",FontFactory.getFont(FontFactory.TIMES, 20f));
			paragrafo.setAlignment(1);
			doc.add(paragrafo);
			
			paragrafo = new Paragraph("  ",FontFactory.getFont(FontFactory.TIMES, 20f));
			paragrafo.setAlignment(1);
			doc.add(paragrafo);
			
			PdfPTable tabelaPDF = new PdfPTable(new float[] { 900f, 2500f,3500f,1000f,800f,1000f,900f });;
			
			PdfPCell celulaMaticula = new PdfPCell(new Paragraph("Matricula",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaNome = new PdfPCell(new Paragraph("Nome",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaEmail= new PdfPCell(new Paragraph("Email",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaEstado = new PdfPCell(new Paragraph("Estado",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaCargo = new PdfPCell(new Paragraph("Cargo",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaRegiao = new PdfPCell(new Paragraph("Regiao",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaSalario = new PdfPCell(new Paragraph("Salario",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			
			tabelaPDF.addCell(celulaMaticula);
			tabelaPDF.addCell(celulaNome);
			tabelaPDF.addCell(celulaEmail);
			tabelaPDF.addCell(celulaEstado);
			tabelaPDF.addCell(celulaCargo);
			tabelaPDF.addCell(celulaRegiao);
			tabelaPDF.addCell(celulaSalario);
			
			
			for (Gerente gerente: repositorioGerente.listarGerente()) {
				celulaMaticula = new PdfPCell(new Paragraph(gerente.getMatricula(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaNome = new PdfPCell(new Paragraph(gerente.getNome(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaEmail = new PdfPCell(new Paragraph(gerente.getEmail(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaEstado = new PdfPCell(new Paragraph(gerente.getEstado(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaCargo = new PdfPCell(new Paragraph(gerente.getCargo(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaRegiao = new PdfPCell(new Paragraph(gerente.getRegiao(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaSalario = new PdfPCell(new Paragraph(String.valueOf(gerente.getSalario()),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				
				tabelaPDF.addCell(celulaMaticula);
				tabelaPDF.addCell(celulaNome);
				tabelaPDF.addCell(celulaEmail);
				tabelaPDF.addCell(celulaEstado);
				tabelaPDF.addCell(celulaCargo);
				tabelaPDF.addCell(celulaRegiao);
				tabelaPDF.addCell(celulaSalario);
			}
			
			doc.add(tabelaPDF);
			doc.close();
			Desktop.getDesktop().open(new File (arquivoPdf));
			
		} catch (Exception e) {
			
		}
		
	}
}
