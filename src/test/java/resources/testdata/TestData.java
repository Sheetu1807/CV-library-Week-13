package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "jobdata")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Dentist","London","up to 10 miles","100000","200000","annum","Permanent","Permanent Dentist jobs in London"},
                {"Pharmacist","Oxford, Oxfordshire","up to 25 miles","50000","70000","annum","Permanent","Permanent Pharmacist jobs in Oxford"},
                {"Maths Teacher","Birmingham","up to 15 miles","30000","40000","annum","Temporary","Temporary Maths Teacher jobs in Birmingham"},
                {"Physiotherapist","Leeds","up to 35 miles","30000","60000","annum","Permanent","Permanent Physiotherapist jobs in Leeds"},
                {"Civil Engineer","London","up to 5 miles","2000","3000","month","Contract","Contract Civil Engineer jobs in London"},
                {"Business Development Manager - NHS/Healthcare","EC1N, Farringdon Without, Greater London","up to 10 miles","35000","50000","annum","Permanent","Permanent Business Development Manager - Nhs/Healthcare jobs in EC1N"}
        };
        return data;
    }

}