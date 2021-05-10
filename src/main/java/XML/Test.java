package XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(GXML.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        GXML gxml = new GXML("12", "21", "32");
        marshaller.marshal(gxml, new FileOutputStream("example.xml"));
        Unmarshaller unmarshal = context.createUnmarshaller();
        File file = new File("example.xml");
        GXML gxml2 = (GXML) unmarshal.unmarshal(file);
        System.out.println(gxml2.toString());

    }
}
