package com.salesforceqa.app;

import com.salesforceqa.app.database.DatabaseConnection;
import com.salesforceqa.app.database.DatabaseUtils;

public class App {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        DatabaseUtils databaseUtils = new DatabaseUtils();
    }
}
