package xml;


import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnitTestingStudentProfile {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        UnitTestingStudentProfile student= new UnitTestingStudentProfile();
        ArrayList<Student> list = new ArrayList<Student>();
        // Implement unit tests for all user-defined methods in this package, here.
        XmlReader xml =new XmlReader();
        list= (ArrayList<Student>) xml.parseData("id","\\C:\\Users\\yahya\\IdeaProjects\\Java_Midterm\\src\\xml\\data\\qtp.xml");


        ProcessStudentInfo.printStudentInfo();
    }
}