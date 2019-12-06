package by.gsu.pmslab;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaxParser {

    private static List<Currency> currencies = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse("http://www.nbrb.by/Services/XmlExRates.aspx", handler);
        for (Currency item : currencies)
            System.out.println(item);
    }

    private static class XMLHandler extends DefaultHandler {
        Currency currency;
        boolean bNumCode = false;
        boolean bCharCode = false;
        boolean bScale = false;
        boolean bName = false;
        boolean bRate = false;
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equalsIgnoreCase("Currency"))
                currency = new Currency();
            if (qName.equalsIgnoreCase("NumCode"))
                bNumCode = true;
            if (qName.equalsIgnoreCase("CharCode"))
                bCharCode = true;
            if (qName.equalsIgnoreCase("Scale"))
                bScale = true;
            if (qName.equalsIgnoreCase("Name"))
                bName = true;
            if (qName.equalsIgnoreCase("Rate"))
                bRate = true;
        }

        @Override
        public void endElement(String uri,
                               String localName, String qName) throws SAXException {
            if (qName.equalsIgnoreCase("Currency")) {
                currencies.add(currency);
            }
        }

        @Override
        public void characters(char ch[], int start, int length) throws SAXException {

            if (bNumCode) {
                currency.setNumCode(new String(ch, start, length));
                bNumCode = false;
            }
            if (bCharCode) {
                currency.setCharCode(new String(ch, start, length));
                bCharCode = false;
            }
            if (bScale) {
                currency.setScale(new String(ch, start, length));
                bScale = false;
            }
            if (bName) {
                currency.setName(new String(ch, start, length));
                bName = false;
            }
            if (bRate) {
                currency.setRate(new String(ch, start, length));
                bRate = false;
            }
        }
    }
}
