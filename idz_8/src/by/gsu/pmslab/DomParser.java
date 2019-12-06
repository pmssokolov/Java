package by.gsu.pmslab;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomParser {


    public DomParser() throws ParserConfigurationException, SAXException, IOException {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("http://www.nbrb.by/Services/XmlExRates.aspx");
            document.getDocumentElement().getElementsByTagName("DailyExRates");

            document.getDocumentElement().normalize();
            System.out.println("Root element :" + document.getDocumentElement().getNodeName());
            NodeList nList = document.getElementsByTagName("Currency");
            System.out.println("----------------------------");
            List<Currency> currencies = new ArrayList<>();
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Currency currency = new Currency();
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    currency.setNumCode(eElement.getElementsByTagName("NumCode").item(0).getTextContent());
                    currency.setCharCode(eElement.getElementsByTagName("CharCode").item(0).getTextContent());
                    currency.setScale(eElement.getElementsByTagName("Scale").item(0).getTextContent());
                    currency.setName(eElement.getElementsByTagName("Name").item(0).getTextContent());
                    currency.setRate(eElement.getElementsByTagName("Rate").item(0).getTextContent());
                }
                currencies.add(currency);
            }

            for (Currency item : currencies){
                System.out.println(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }

