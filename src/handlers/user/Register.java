package handlers.user;

import handlers.bank.Overview;
import io.ngw.ActionHandler;
import io.ngw.In;
import io.ngw.result.ForwardResult;
import io.ngw.result.RedirectResult;
import io.ngw.result.Result;

import static com.google.common.base.Strings.isNullOrEmpty;

public class Register extends ActionHandler {

  @In public String username;
  @In public String password;
  @In public String country;

  @Override
  public Result handle() {
    if (isNullOrEmpty(username) || isNullOrEmpty(password)
        || isNullOrEmpty(country)) {
      return new ForwardResult(new RegistrationForm());
    }
    return new RedirectResult(new Overview(11L), getContext());
  }
}
