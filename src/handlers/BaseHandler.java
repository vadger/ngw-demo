package handlers;


import interceptors.LoggingInterceptor;
import io.ngw.ActionHandler;
import io.ngw.interceptors.Before;

@Before(LoggingInterceptor.class)
public abstract class BaseHandler extends ActionHandler {
  protected BaseHandler() {
    addBeforeActionEvent(() -> {
      System.out.println("initializing some common stuff for " + BaseHandler.this.getClass());
    });
  }
}
