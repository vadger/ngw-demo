package config;

import io.ngw.Server;

public class Launcher extends Server {
  public static void main(String[] args) throws Exception {
    Launcher launcher = new Launcher();
    launcher.getRouteResolver().addRouter(new Router());
    launcher.start();
  }
}
