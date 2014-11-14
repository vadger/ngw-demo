package interceptors;

import io.ngw.ActionContext;
import io.ngw.interceptors.BeforeInterceptor;
import io.ngw.result.ForwardInterceptionResult;
import io.ngw.result.Result;

import javax.inject.Singleton;

@Singleton
public class LoggingInterceptor implements BeforeInterceptor {
  @Override
  public Result intercept(ActionContext context) {
    System.out.println("handler " + context.getHandlerClass() + " is being invoked");
    return new ForwardInterceptionResult();
  }
}
