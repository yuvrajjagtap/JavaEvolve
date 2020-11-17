import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java7 {

    public static void main (String[] args) {
        int a = 0b110;
        System.out.println(a);
    }

    public static void diamondOperator() { // Infer to a type
        // Java 6
        Map<String, Map<String,Integer>> testMap = new HashMap<String, Map<String,Integer>>();
        // Java 7
        Map<String, Map<String,Integer>> testMap1 = new HashMap<>();
    }

    public static void switchStrings(String currency) {
        // Java 6
        if ("EUR".equals(currency)) {
            System.out.println("Europe");
        } else if ("USD".equals(currency)) {
            System.out.println("America");
        } else {
            System.out.println("Unknown Currency");
        }
        // Java 7
        Map<String, Map<String,Integer>> testMap1 = new HashMap<>();
        switch(currency) {
            case "EUR" :
                System.out.println("Europe");
                break;
            case "USD" :
                System.out.println("America");
                break;
            default :
                System.out.println("Unknown Currency");
        }
    }

    public static void multiCatch() {
        // Java 6
        try {
            File f = new File("abc.txt");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(f);
        } catch (ParserConfigurationException pe) {
            pe.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Java 7
        try {
            File f = new File("abc.txt");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(f);
        } catch (IOException | ParserConfigurationException | SAXException e){
            e.printStackTrace();
        }
    }

    public static void autoResourceClosing() { // try resources
        // Java 6
        File f = new File("abc.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // Java 7 ------- All Objects Implementing java.lang.AutoCloseable
        File f1 = new File("abc.txt");
        try (FileInputStream fis1 = new FileInputStream(f1)) {
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void underscoreInNumbers() {
        // Java 6
        int amount = 1000000;
        long cardNumber = 1234123455550000l;
        float pi = 3.141592653589793238f;
        // Java 7 -------you can put underscore at any place, except at the beginning, at the end and right after/before the decimal point.
        int amount2 = 1_000_000;
        long cardNumber2 = 1234_1234_5555_0000l;
        float pi2 = 3.1415_9265_3589_7932_38f;
    }
}
