package fr.paris.lutece.plugins.example.modules.elastic.extend;

import java.util.Collection;

import fr.paris.lutece.plugins.elasticdata.business.AbstractDataSource;
import fr.paris.lutece.plugins.elasticdata.business.DataObject;
import fr.paris.lutece.plugins.elasticdata.business.DataSource;
import fr.paris.lutece.portal.service.spring.SpringContextService;

public class ExtendProjectDataSource extends AbstractDataSource implements DataSource{
	
	@Override
    public Collection<DataObject> getDataObjects( )
    {

		ExtendProjectDao dao = new ExtendProjectDao();
	    return dao.selectAll();
    }
	
}
