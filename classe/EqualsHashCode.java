package classe;

import javax.sql.rowset.spi.SyncResolver;

public class EqualsHashCode {
    Usuario u1 = new Usuario();
    u1.nome = "Pedro Silva";
    u1.email = "pedrosilva@gmail.com";

    Usuario u2 = new Usuario();
    u2.nome = "Pedro Silva";
    u2.email = "pedrosilva@gmail.com";

    System.out.println(u1 == u2);

}
