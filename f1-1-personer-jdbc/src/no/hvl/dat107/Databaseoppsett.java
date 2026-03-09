package no.hvl.dat107;

public class Databaseoppsett {
    public static final String JDBC_DRIVER = "org.postgresql.Driver";

    public static final String DATABASE = "xxxx";   // Endre til din databae = ditt brukernavn
    public static final String BRUKERNAVN = "xxxx"; // Endre til ditt brukernavn
    public static final String PASSORD = "yyyy";    // Endre til ditt passord

    public static final String TJENER_OG_PORT = "ider-database.westeurope.cloudapp.azure.com:5432";
    public static final String DB_URL = "jdbc:postgresql://" + TJENER_OG_PORT + "/" + DATABASE;
}
