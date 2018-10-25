// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package sapodataconnector.actions;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.MendixException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.thirdparty.org.json.JSONObject;
import com.mendix.webui.CustomJavaAction;
import sapodataconnector.proxies.constants.Constants;
import sapodataconnector.utils.JsonSerializer;
import sapodataconnector.utils.HttpRequest;
import sapodataconnector.utils.ToMendixSerializer;

public class ExecuteSingle extends CustomJavaAction<IMendixObject>
{
	private java.lang.String url;
	private sapodataconnector.proxies.HttpMethod httpMethod;
	private IMendixObject __functionParameters;
	private sapodataconnector.proxies.FunctionParameters functionParameters;
	private IMendixObject __requestParameters;
	private sapodataconnector.proxies.RequestParams requestParameters;
	private java.lang.String responseType;
	private java.lang.Boolean useSAPCloudConnector;

	public ExecuteSingle(IContext context, java.lang.String url, java.lang.String httpMethod, IMendixObject functionParameters, IMendixObject requestParameters, java.lang.String responseType, java.lang.Boolean useSAPCloudConnector)
	{
		super(context);
		this.url = url;
		this.httpMethod = httpMethod == null ? null : sapodataconnector.proxies.HttpMethod.valueOf(httpMethod);
		this.__functionParameters = functionParameters;
		this.__requestParameters = requestParameters;
		this.responseType = responseType;
		this.useSAPCloudConnector = useSAPCloudConnector;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		this.functionParameters = __functionParameters == null ? null : sapodataconnector.proxies.FunctionParameters.initialize(getContext(), __functionParameters);

		this.requestParameters = __requestParameters == null ? null : sapodataconnector.proxies.RequestParams.initialize(getContext(), __requestParameters);

		// BEGIN USER CODE
		if(LOGGER.isDebugEnabled()) {
			LOGGER.debug(new StringBuilder(getContext().getSession().getId().toString())
					.append("|")
					.append(httpMethod)
					.append("|ExecuteSingle, url: ")
					.append(url)
					.toString());
		}

		String bodyContent = null;
		String parameterizedUrl = url;
		if (httpMethod.equals(sapodataconnector.proxies.HttpMethod.POST)
				&& (functionParameters != null && !functionParameters.getpostParameterInline())) {
			bodyContent = JsonSerializer.writeMendixObjectToJson(getContext(), __functionParameters, false).toString();
		} else {
			parameterizedUrl = HttpRequest.setGetParameters(getContext(), url, functionParameters);
		}

		HttpRequest getSingleCall = new HttpRequest(getContext(), parameterizedUrl, httpMethod.name(), bodyContent, __requestParameters, useSAPCloudConnector);
		String response = getSingleCall.executeAction();

		// response handling
		final JSONObject resultObjectD = new JSONObject(response).getJSONObject("d");
		if (resultObjectD == null) {
			throw new MendixException("Expecting exactly one result, got nothing");
		}
		// check result has on property, use that
		if (resultObjectD.length() != 1) {
			throw new MendixException("Expecting one result on 'd', got " + resultObjectD.toString());
		}
		JSONObject resultFromFunction = resultObjectD.getJSONObject(resultObjectD.keys().next());

		IMendixObject target = Core.instantiate(getContext(), responseType);
		ToMendixSerializer.updateMendixObject(getContext(), resultFromFunction, target);

		return target;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ExecuteSingle";
	}

	// BEGIN EXTRA CODE
	private static final ILogNode LOGGER = Core.getLogger(Constants.getLogNode());
	// END EXTRA CODE
}
