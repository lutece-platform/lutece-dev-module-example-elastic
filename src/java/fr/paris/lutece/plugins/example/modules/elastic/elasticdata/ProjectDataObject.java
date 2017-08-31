package fr.paris.lutece.plugins.example.modules.elastic.elasticdata;

import fr.paris.lutece.plugins.elasticdata.business.DataObject;

/**
 * Project Data Object
 */
public class ProjectDataObject implements DataObject
{
    // fields
    private int _id;
    private String _strName;
    private String _strDescription;
    private String _strImageUrl;
    private int _cout;

    // getters and setters : all those attributes will be created in the index 
    public int getId()  {return _id;}
    public void setId(int id ) {_id=id;}
    
    public String getName() {return _strName;}
    public void setName(String name){_strName=name;}
    
    public String getDescription(){return _strDescription;}
    public void setDescription(String description){_strDescription=description;}
    
    public String getImageUrl(){return _strImageUrl;}
    public void setImageUrl(String imageUrl){_strImageUrl=imageUrl;}
    
    public int getCout(){return _cout;}
    public void setCout(int cout){_cout=cout;}

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