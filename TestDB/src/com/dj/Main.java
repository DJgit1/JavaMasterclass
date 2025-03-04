package com.dj;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONEECTION_STRING = "jdbc:sqlite:C:\\Users\\shree\\IdeaProjects\\TestDB\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\shree\\IdeaProjects\\TestDB\\testjava.db");
//            Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

        try {
            Connection conn = DriverManager.getConnection(CONEECTION_STRING);
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABlE IF EXISTS " + TABLE_CONTACTS);


            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text," +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" +
                    ")");

            insertContact(statement, "DJ", 7677668, "DJ@email.com");
            
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('DJ', 7677668, 'DJ@email.com')");

            insertContact(statement, "FC", 5566789, "FC@email.com");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('FC', 5566789, 'FC@email.com')");

            insertContact(statement, "EW", 7561968, "EW@email.com");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('EW', 7561968, 'EW@email.com')");

            insertContact(statement, "BC", 123654, "BC@email.com");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('BC', 123654, 'BC@email.com')");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=5566789" +
                    " WHERE " + COLUMN_NAME + "='FC'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + "='BC'");


            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }

            results.close();

            statement.clearBatch();
            conn.close();

//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                                   "VALUES('DF', 7122368, 'FD@email.com')");

//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('FC', 78768, 'FC@email.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('EW', 7561968, 'EW@email.com')");

//            statement.execute("UPDATE contacts SET phone = 5566789 WHERE name = 'FC'");
//            statement.execute("DELETE FROM contacts WHERE name = 'DF'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();


        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact (Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
