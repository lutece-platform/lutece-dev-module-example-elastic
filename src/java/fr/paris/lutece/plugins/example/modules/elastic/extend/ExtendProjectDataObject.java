package fr.paris.lutece.plugins.example.modules.elastic.extend;

import fr.paris.lutece.plugins.elasticdata.business.DataObject;

/**
 * ExtendProjectDataObject
 */

public class ExtendProjectDataObject implements DataObject{
	
	// fields
    private int _idHit;
    private String _strIdResource;
    private String _strResourceType;
    private int _strNbHits;

    // getters and setters : all those attributes will be created in the index 
    public int getId()  {return _idHit;}
    public void setId(int id ) {_idHit=id;}
    
    public String getIdResource() {return _strIdResource;}
    public void setIdResource(String idResource){_strIdResource=idResource;}
    
    public String getResourceType(){return _strResourceType;}
    public void setResourceType(String resourceType){_strResourceType=resourceType;}
    
    public int getNbHits(){return _strNbHits;}
    public void setNbHits(int nbHits){_strNbHits=nbHits;}

    // implementation of the DataObject interface
    /**
     * {@inheritDoc }
     */
    @Override
    public String getTimestamp( )
    {
    	String Time="1000";
		return Time;
       // time in milliseconds
    }   
}
