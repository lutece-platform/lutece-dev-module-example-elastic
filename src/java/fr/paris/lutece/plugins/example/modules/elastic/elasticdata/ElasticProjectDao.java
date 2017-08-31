package fr.paris.lutece.plugins.example.modules.elastic.elasticdata;

import java.util.ArrayList;
import java.util.Collection;

import fr.paris.lutece.plugins.elasticdata.business.DataObject;
import fr.paris.lutece.util.sql.DAOUtil;

public class ElasticProjectDao {
	 private static final String SQL_QUERY_SELECTALL = "SELECT * FROM example_project;";

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
	           ProjectDataObject object= new ProjectDataObject ();

	           object.setId( daoUtil.getInt( 1 ) );
	           object.setName( daoUtil.getString( 2 ) );
	           object.setDescription( daoUtil.getString( 3 ));
	           object.setImageUrl(daoUtil.getString(4));
	           object.setCout(daoUtil.getInt( 5 ));

	           listObjects.add( object );
	       }

	       daoUtil.free();
	       return listObjects;
	   }
}
