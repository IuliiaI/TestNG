package review01;

import org.testng.annotations.DataProvider;

public class AnotherDataProviderDemo {

    @DataProvider(name="credentials")
    public Object[][] data(){
        Object[][] loginData = {
                {"Admin", "12345"},
                {"ABCD", "Hum@nhrm123"},
                {"Admin", ""},
                {"", "Hum@nhrm123"}
        };
        return loginData;

    }


}
