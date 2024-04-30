package fr.abes.theses.diffusion.filters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(1)
public class MaintenanceFilter implements Filter {

    @Value("${maintenance}")
    private boolean isMaintenance;

    @Value("${maintenance.message}")
    private String maintenanceMsg;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        if (isMaintenance) {
            httpResponse.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
            httpResponse.getWriter().write(maintenanceMsg);
        } else {
            chain.doFilter(request, response);
        }
    }
}
