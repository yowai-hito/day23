package giphy.pikachu.Repositories;

public interface QueryStrings {
    public static final String SQL_INSERT_DATA =
    "insert into day23.users (email, name, phone, status, dob, passphrase) VALUES (?,?,?,?,?, SHA2(?,256) )";
}
