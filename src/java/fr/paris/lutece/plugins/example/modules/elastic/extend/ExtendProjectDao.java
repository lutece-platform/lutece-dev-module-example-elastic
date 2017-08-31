package fr.paris.lutece.plugins.example.modules.elastic.extend;

import java.util.ArrayList;
import java.util.Collection;

import fr.paris.lutece.plugins.elasticdata.business.DataObject;
import fr.paris.lutece.util.sql.DAOUtil;

public class ExtendProjectDao {
	private static final String SQL_QUERY_SELECTALL = "SELECT * FROM extend_extender_hit;";

	   /**
	    * Load the data of all the objects and returns them as a list
	    *
	    * @return The list which contains the data of all the objects
	    */
	   public Collection<DataObject> selectAll()
	   {
	       Collection<DataObject> listObjects= new ArrayList<>();
	       DAOUtil daoUtil = new DAOUtil( SQL_QUERY_SELECTALL );
	       daoUtil.executeQuery();

	       while( daoUtil.next() )
	       {
	           ExtendProjectDataObject object= new ExtendProjectDataObject ();

	           object.setId( daoUtil.getInt( 1 ) );
	           object.setIdResource( daoUtil.getString( 2 ) );
	           object.setResourceType( daoUtil.getString( 3 ));
	           object.setNbHits(daoUtil.getInt( 4 ));

	           listObjects.add( object );
	       }

	       daoUtil.free();
	       return listObjects;
	   }
}
