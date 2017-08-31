package fr.paris.lutece.plugins.example.modules.elastic.elasticdata;

import java.util.Collection;

import fr.paris.lutece.plugins.elasticdata.business.AbstractDataSource;
import fr.paris.lutece.plugins.elasticdata.business.DataObject;
import fr.paris.lutece.plugins.elasticdata.business.DataSource;
import fr.paris.lutece.plugins.example.modules.elastic.extend.ExtendProjectDao;
import fr.paris.lutece.portal.service.spring.SpringContextService;

/**
 * My DataSource
 */
public class ProjectDataSource extends AbstractDataSource implements DataSource
{
	
    
    @Override
    public Collection<DataObject> getDataObjects( )
    {
    	ElasticProjectDao dao = new ElasticProjectDao();
        return dao.selectAll();
    }
}
