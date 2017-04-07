// This file was generated by Mendix Modeler 7.1.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmustachetests.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the MxMustacheTests module
	public static void test_CsvTemplateMultipleObjects(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxMustacheTests.Test_CsvTemplateMultipleObjects", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void test_CsvTemplateMultipleObjectsToFile(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxMustacheTests.Test_CsvTemplateMultipleObjectsToFile", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void test_EmailMarkdownTemplateMultipleObjects(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxMustacheTests.Test_EmailMarkdownTemplateMultipleObjects", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void test_EmailPdfMarkdownTemplateMultipleObjects(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxMustacheTests.Test_EmailPdfMarkdownTemplateMultipleObjects", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void test_JsonTemplateMultipleObjects(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxMustacheTests.Test_JsonTemplateMultipleObjects", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void test_MarkdownPdfTemplateMultipleObjects(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxMustacheTests.Test_MarkdownPdfTemplateMultipleObjects", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void test_MarkdownTemplateMultipleObjects(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxMustacheTests.Test_MarkdownTemplateMultipleObjects", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void test_TemplateSingleObject(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxMustacheTests.Test_TemplateSingleObject", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void test_XmlTemplateMultipleObjects(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxMustacheTests.Test_XmlTemplateMultipleObjects", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}