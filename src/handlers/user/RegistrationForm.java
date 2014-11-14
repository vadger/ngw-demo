package handlers.user;

import io.ngw.ActionHandler;
import io.ngw.Out;
import io.ngw.result.FreemarkerResult;
import io.ngw.result.Result;

import java.util.List;

import static java.util.Arrays.asList;

public class RegistrationForm extends ActionHandler {

  @Out public List<String> countries = asList("Estonia", "Russia", "USA");

  @Override
  public Result handle() {
    return new FreemarkerResult(this);
  }
}
