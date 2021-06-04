package SoapRequests;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.support.SoapUIException;
import org.apache.xmlbeans.XmlException;

import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) throws XmlException, IOException, SoapUIException {

        WsdlProject project = new WsdlProject("C:\\Users\\PC\\Documents\\calulator-for-framework-soapui-project.xml");

        WsdlTestSuite testSuite = project.getTestSuiteByName("TestSuite");

        for(int i=0 ; i<testSuite.getTestCaseCount();i++)
        {
            WsdlTestCase testcase = testSuite.getTestCaseAt(i);

            testcase.run(new PropertiesMap(),false);
        }
    }
}
