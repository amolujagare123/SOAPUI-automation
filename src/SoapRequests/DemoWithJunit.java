package SoapRequests;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCaseRunner;
import com.eviware.soapui.model.testsuite.TestRunner;

import static com.eviware.soapui.model.testsuite.TestRunner.Status;

import com.eviware.soapui.support.SoapUIException;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class DemoWithJunit {

    @Test
    public  void myTest() throws XmlException, IOException, SoapUIException {

        WsdlProject project = new WsdlProject("C:\\Users\\PC\\Documents\\calulator-for-framework-soapui-project.xml");

        WsdlTestSuite testSuite = project.getTestSuiteByName("TestSuite");

        for(int i=0 ; i<testSuite.getTestCaseCount();i++)
        {
            WsdlTestCase testcase = testSuite.getTestCaseAt(i);

            TestCaseRunner runner = testcase.run(new PropertiesMap(), false);

            Assert.assertEquals(runner.getReason(),Status.FINISHED,runner.getStatus());
        }
    }
}
