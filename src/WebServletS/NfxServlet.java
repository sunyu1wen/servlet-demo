package WebServletS;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

/**
 * @author Bocai
 * @version V1.0
 * @ClassName: ${file_name}
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @Date ${date} ${time}
 */
@WebServlet("/NfxServlet")
public class NfxServlet extends CXFNonSpringServlet {
    private static final String SERVICE_SUFFIX = "";// "Facade";

    private static final long serialVersionUID = 8262880864551976903L;

    @Override
    public void loadBus(ServletConfig servletConfig) {
        super.loadBus(servletConfig);

        Bus bus = getBus();
        BusFactory.setDefaultBus(bus);

        MyServiceImpl helloworldImpl = new MyServiceImpl();
        ServerFactoryBean svrFactory = new ServerFactoryBean();
        svrFactory.setServiceClass(MyService.class);
        svrFactory.setAddress("/HelloWorld");
        svrFactory.setServiceBean(helloworldImpl);
        // svrFactory.getServiceFactory().setDataBinding(new
        // AegisDatabinding());
        svrFactory.create();
    }
}
