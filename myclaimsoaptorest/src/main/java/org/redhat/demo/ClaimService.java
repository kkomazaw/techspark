package org.redhat.demo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2018-01-17T17:45:54.430-05:00
 * Generated source version: 3.1.3
 * 
 */
@WebServiceClient(name = "ClaimService", 
                  wsdlLocation = "http://localhost:8080/soap-api/claim?wsdl",
                  targetNamespace = "http://demo.redhat.org/") 
public class ClaimService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://demo.redhat.org/", "ClaimService");
    public final static QName ClaimServicePort = new QName("http://demo.redhat.org/", "ClaimServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/soap-api/claim?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ClaimService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/soap-api/claim?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ClaimService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ClaimService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClaimService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ClaimService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ClaimService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ClaimService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ClaimServicePortType
     */
    @WebEndpoint(name = "ClaimServicePort")
    public ClaimServicePortType getClaimServicePort() {
        return super.getPort(ClaimServicePort, ClaimServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClaimServicePortType
     */
    @WebEndpoint(name = "ClaimServicePort")
    public ClaimServicePortType getClaimServicePort(WebServiceFeature... features) {
        return super.getPort(ClaimServicePort, ClaimServicePortType.class, features);
    }

}