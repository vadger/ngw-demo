package handlers.secure;

import handlers.BaseHandler;
import handlers.bank.Overview;
import interceptors.LoggingInterceptor;
import io.ngw.*;
import io.ngw.interceptors.Before;
import io.ngw.result.FreemarkerResult;
import io.ngw.result.RedirectResult;
import io.ngw.result.Result;
import services.UserService;

import javax.inject.Inject;
import java.util.Date;

public class Login extends BaseHandler {

  @Inject UserService userService;

  @In String username;
  @In String password;

  @Out Date loginTime;

  @Override
  public Result handle() {
    loginTime = new Date();
    if ("bob".equals(username) && "secret".equals(password))
      return new RedirectResult(new Overview(11L), getContext());
    return new FreemarkerResult(this);
  }
}
