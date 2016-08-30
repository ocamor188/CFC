package com.cfc.configuration;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.cfc.controller.CORSFilter;

public class CFCSpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { CFCSpringConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	 @Override
	    protected Filter[] getServletFilters() {
	    	Filter [] singleton = { new CORSFilter() };
	    	return singleton;
		}	
	/*public void onStartup(ServletContext container) throws ServletException {

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(CFCSpringConfiguration.class);
		ctx.setServletContext(container);

		ServletRegistration.Dynamic servlet = container.addServlet(
				"dispatcher", new DispatcherServlet(ctx));

		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}*/

}
