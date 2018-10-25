package system;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

import com.mendix.core.actionmanagement.IActionRegistrator;

@Component(immediate = true)
public class UserActionsRegistrar
{
  @Reference
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(questionnaire.actions.RefreshClass.class);
    registrator.registerUserAction(sapodataconnector.actions.AddBasicAuthentication.class);
    registrator.registerUserAction(sapodataconnector.actions.AddHeader.class);
    registrator.registerUserAction(sapodataconnector.actions.Create.class);
    registrator.registerUserAction(sapodataconnector.actions.CreateHeaders.class);
    registrator.registerUserAction(sapodataconnector.actions.Delete.class);
    registrator.registerUserAction(sapodataconnector.actions.ExecuteCollection.class);
    registrator.registerUserAction(sapodataconnector.actions.ExecuteSingle.class);
    registrator.registerUserAction(sapodataconnector.actions.GetCloudConnectorInfo.class);
    registrator.registerUserAction(sapodataconnector.actions.GetEntry.class);
    registrator.registerUserAction(sapodataconnector.actions.GetLatestHttpResponse.class);
    registrator.registerUserAction(sapodataconnector.actions.GetList.class);
    registrator.registerUserAction(sapodataconnector.actions.Refresh.class);
    registrator.registerUserAction(sapodataconnector.actions.Update.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
