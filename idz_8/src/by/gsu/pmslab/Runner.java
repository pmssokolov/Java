package by.gsu.pmslab;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        DomParser domParser = new DomParser();
        SaxParser saxParser = new SaxParser();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse("http://www.nbrb.by/Services/XmlExRates.aspx");
        document.getDocumentElement().normalize();
        System.out.println("Root element :" + document.getDocumentElement().getNodeName());
        NodeList nList = document.getElementsByTagName("DailyExRates");
        System.out.println("----------------------------");
        System.out.println(nList.toString());
        document.getDocumentElement().getElementsByTagName("DailyExRates");
        System.out.println(document.getDocumentElement().getElementsByTagName("DailyExRates"));

    }
}
