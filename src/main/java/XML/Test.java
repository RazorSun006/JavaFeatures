package XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance(FuckYou.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        GXML gxml = new GXML("12", "21", "32");
        GXML gxml2 = new GXML("12", "21", "32");
        GXML gxml3 = new GXML("12", "21", "32");
        List<GXML> list = new ArrayList<GXML>();
        list.add(gxml);
        list.add(gxml2);
        list.add(gxml3);
        FuckYou fuckYou = new FuckYou();
        fuckYou.setList(list);
        fuckYou.setAngry("what the fuck ? ! ");
        marshaller.marshal(fuckYou, new FileOutputStream("example.xml"));
       /* Unmarshaller unmarshal = context.createUnmarshaller();
        File file = new File("example.xml");
        GXML gxml2 = (GXML) unmarshal.unmarshal(file);
        System.out.println(gxml2.toString());*/

    }
}
