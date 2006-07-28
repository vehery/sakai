package org.sakaiproject.rights.api;

import java.util.Stack;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public interface Copyright 
{
	public String getYear();
	public String getOwner();
	
	public Element toXml(Document doc, Stack stack);
	
}	// interface Copyright
