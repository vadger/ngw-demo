package config;


import handlers.bank.Overview;
import handlers.secure.Login;
import handlers.user.Register;
import handlers.user.RegistrationForm;

public class Router extends io.ngw.Router {
  @Override
  public void init() {
    get("/secure/login", Login.class);
    get("/overview", Overview.class);
    get("/user/registrationform", RegistrationForm.class);
    post("/user/register", Register.class);
  }
}
