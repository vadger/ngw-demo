<form action="/user/register" method="post">
  Username: <input name="username" value="${(actionContext.getRequestParameter('username'))!}"><br>
  Password: <input name="password" type="password"><br>
  Where are you from?
  <select name="country">
    <#list countries as country>
        <option value="${country}">${country}</option>
    </#list>
  </select>
  <br>
  <button>Register</button>
</form>