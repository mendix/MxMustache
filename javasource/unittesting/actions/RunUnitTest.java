// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package unittesting.actions;

import unittesting.TestManager;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class RunUnitTest extends CustomJavaAction<Boolean>
{
	private IMendixObject __unitTest;
	private unittesting.proxies.UnitTest unitTest;

	public RunUnitTest(IContext context, IMendixObject unitTest)
	{
		super(context);
		this.__unitTest = unitTest;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.unitTest = __unitTest == null ? null : unittesting.proxies.UnitTest.initialize(getContext(), __unitTest);

		// BEGIN USER CODE
		TestManager.instance().runTest(getContext(), unitTest);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "RunUnitTest";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
