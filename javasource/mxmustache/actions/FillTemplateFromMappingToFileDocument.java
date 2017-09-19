// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxmustache.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

public class FillTemplateFromMappingToFileDocument extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String Template;
	private java.lang.String JsonData;
	private java.lang.Boolean RunMarkdown;
	private IMendixObject __DestinationFile;
	private system.proxies.FileDocument DestinationFile;

	public FillTemplateFromMappingToFileDocument(IContext context, java.lang.String Template, java.lang.String JsonData, java.lang.Boolean RunMarkdown, IMendixObject DestinationFile)
	{
		super(context);
		this.Template = Template;
		this.JsonData = JsonData;
		this.RunMarkdown = RunMarkdown;
		this.__DestinationFile = DestinationFile;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.DestinationFile = __DestinationFile == null ? null : system.proxies.FileDocument.initialize(getContext(), __DestinationFile);

		// BEGIN USER CODE
        throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "FillTemplateFromMappingToFileDocument";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
