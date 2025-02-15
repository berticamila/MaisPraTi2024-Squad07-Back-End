package com.maisprati.codifica.alucar.Util.FileReader;

import java.io.IOException;
import java.util.Map;

public class ConversionTester {
    public static void main(String[] args) {
        PDFUtils.createCNH_PDFfile(
                "Vernon Roche" , "123432987" , "SSP" , "PR" , "34534567612" ,
                "21/05/1987" , "Papirus Roche" , "Magda Roche" ,
                "012345678901234" , "21/12/2025" , "01/06/2008" , "AB"
        );

        CNH_Extraction cnh = new CNH_Extraction();
        try { byte[] pdfBytes =
            PDFUtils.convertFileToBytes("src/main/java/com/maisprati/codifica/alucar/Util/FileReader/CNH_exemplo.pdf");
            Map<String, String> extractedValues = CNH_Extraction.extractCNH_EssentialValuesFromPDF(pdfBytes);
            extractedValues.forEach((key, value) -> System.out.println(key + ": " + value));
        }catch (IOException e) { e.fillInStackTrace(); }
    }
}


