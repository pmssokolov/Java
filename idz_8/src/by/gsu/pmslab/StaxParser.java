package by.gsu.pmslab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxParser {


        public static void main(String[] args) {
            String fileName = "/home/evgeniysokolov/idz_8/src/resources/currency.xml";
            List<Currency> currencies = parseXML(fileName);
            for(Currency item : currencies){
                System.out.println(item.toString());
            }
        }

        private static List<Currency> parseXML(String fileName) {
            List<Currency> empList = new ArrayList<>();
            Currency emp = null;
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            try {
                XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
                while(xmlEventReader.hasNext()){
                    XMLEvent xmlEvent = xmlEventReader.nextEvent();
                    if (xmlEvent.isStartElement()){
                        StartElement startElement = xmlEvent.asStartElement();
                        if(startElement.getName().getLocalPart().equals("Currency")){
                            emp = new Currency();
                            //Get the 'id' attribute from Employee element
                            Attribute idAttr = startElement.getAttributeByName(new QName("Id"));
                            if(idAttr != null){
                                emp.setId(idAttr.getValue());
                            }
                        }
                        //set the other varibles from xml elements
                        else if(startElement.getName().getLocalPart().equals("NumCode")){
                            xmlEvent = xmlEventReader.nextEvent();
                            emp.setNumCode(xmlEvent.asCharacters().getData());
                        }else if(startElement.getName().getLocalPart().equals("CharCode")){
                            xmlEvent = xmlEventReader.nextEvent();
                            emp.setCharCode(xmlEvent.asCharacters().getData());
                        }else if(startElement.getName().getLocalPart().equals("Scale")){
                            xmlEvent = xmlEventReader.nextEvent();
                            emp.setScale(xmlEvent.asCharacters().getData());
                        }else if(startElement.getName().getLocalPart().equals("Name")){
                            xmlEvent = xmlEventReader.nextEvent();
                            emp.setName(xmlEvent.asCharacters().getData());
                        }else if(startElement.getName().getLocalPart().equals("Rate")){
                            xmlEvent = xmlEventReader.nextEvent();
                            emp.setRate(xmlEvent.asCharacters().getData());
                        }
                    }
                    //if Employee end element is reached, add employee object to list
                    if(xmlEvent.isEndElement()){
                        EndElement endElement = xmlEvent.asEndElement();
                        if(endElement.getName().getLocalPart().equals("Currency")){
                            empList.add(emp);
                        }
                    }
                }

            } catch (FileNotFoundException | XMLStreamException e) {
                e.printStackTrace();
            }
            return empList;
        }
}
