package handlers.bank;

import handlers.BaseHandler;
import io.ngw.result.Result;
import io.ngw.result.SimpleResult;

public class Home extends BaseHandler {
  @Override
  public Result handle() {
    return new SimpleResult("home, sweet home");
  }
}
