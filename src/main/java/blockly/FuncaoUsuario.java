package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class FuncaoUsuario {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// FuncaoUsuario
public static Var ObterIdLogado() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.database.Operations.getField(cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id, u.name, u from User u where u.login = :login"),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName())), Var.valueOf("this[0]"));
   }
 }.call();
}

}

