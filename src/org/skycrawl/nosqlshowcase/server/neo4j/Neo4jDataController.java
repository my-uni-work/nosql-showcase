package org.skycrawl.nosqlshowcase.server.neo4j;

import org.skycrawl.nosqlshowcase.server.root.db.AbstractDataController;

public class Neo4jDataController extends AbstractDataController<Object>
{
	public Neo4jDataController(Object connection)
	{
		super(connection);
	}

	@Override
	public void init() throws Exception
	{
		// TODO Auto-generated method stub
	}
	
	//----------------------------------------------------------------
	// INHERITED MASSIVE MANIPULATION ROUTINES
	
	@Override
	public void clearDatabase()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void loadSampleData()
	{
		// TODO Auto-generated method stub
	}
}