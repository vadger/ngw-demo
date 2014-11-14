package handlers.bank;

import handlers.BaseHandler;
import io.ngw.ActionContext;
import io.ngw.ActionHandler;
import io.ngw.In;
import io.ngw.Out;
import io.ngw.result.FreemarkerResult;
import io.ngw.result.Result;

public class Overview extends BaseHandler {

  @Out public String escapedByDefault = "<b>escaped by default</b>";

  @In public Long accountIdToHighlight;

  public Overview() {}

  public Overview(Long accountIdToHighlight) {
    this.accountIdToHighlight = accountIdToHighlight;
  }

  @Override
  public Result handle() {
    return new FreemarkerResult(this);
  }
}
